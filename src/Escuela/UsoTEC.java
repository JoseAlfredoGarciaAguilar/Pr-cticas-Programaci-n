package Escuela;
import Prácticas.Leer;
//PIDE N ESTUDIANTES Y N MAESTROS Y CALCULA ESTADÍSTICAS DE LOS DOS
public class UsoTEC {

	public static void main(String[] args) {
		System.out.println("TEC DE CULIACÁN");
		System.out.print("NÚMERO DE ESTUDIANTES: ");
		int est = Leer.datoInt();
		System.out.print("NÚMERO DE MAESTROS: ");
		int mae = Leer.datoInt();
		
		//SE DECLARAN LOS VECTORES
		Estudiante[] estudiante = new Estudiante[est];
		Maestro[] maestro = new Maestro[mae];
		
		//SE DECLARAN LOS MÉTODOS
		PedirEstudiantes(estudiante);
		PedirMaestros(maestro);
		Carreras(estudiante);
		Aprobados(estudiante);
		Materias(maestro);
		MasDe20Mil(maestro);
	}
	
	//SE PIDEN LOS DATOS DE LOS ESTUDIANTES
	public static void PedirEstudiantes(Estudiante[] estudiante) {
		int edad;
		String carrera;
		double calif;
		if(estudiante.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE ESTUDIANTES-");
			for(int a=0; a<estudiante.length; a++) {
				System.out.print("NOMBRE DEL ESTUDIANTE " +(a+1) + ": ");
				String nom = Leer.dato();
				//VALIDA QUE SE INGRESE UNA EDAD ENTRE 18 Y 70
				do {
					System.out.print("EDAD DE " + nom + " (18-70): ");
					edad = Leer.datoInt();
					if(edad<18) {
						System.out.println(nom + " NO PUEDE TENER MENOS DE 18 AÑOS...");
					}
					else if(edad>70) {
						System.out.println(nom + " NO PUEDE TENER MÁS DE 70 AÑOS...");
					}else {
						System.out.println(nom + " TIENE " + edad + " AÑOS");
					}
				}while(edad<18||edad>70);
				//VALIDA QUE SE INGRESE UNA CARRERA VÁLIDA
				do {
					System.out.print("CARRERA DE " + nom + " (SISTEMAS //  INDUSTRIAL //  AMBIENTAL): ");
					carrera = Leer.dato();
					if(!carrera.equals("SISTEMAS")&&!carrera.equals("INDUSTRIAL")&&!carrera.equals("AMBIENTAL")) {
						System.out.println("CARRERA INVÁLIDA...");
					}else {
						System.out.println(nom + " ESTUDIA INGENIERÍA " + carrera);
					}
				}while(!carrera.equals("SISTEMAS")&&!carrera.equals("INDUSTRIAL")&&!carrera.equals("AMBIENTAL"));
				//VALIDA QUE SE INGRESE UNA CALIFICAICIÓN ENTRE 0 Y 100
				do {
					System.out.print("CALIFICACIÓN DE " + nom + " (0-100): ");
					calif = Leer.datoDouble();
					if(calif<0) {
						System.out.println(nom + " NO PUEDE TENER MENOS DE 0...");
					}
					else if(calif>100) {
						System.out.println(nom + " NO PUEDE TENER MÁS DE 100...");
					}
					else if(calif>0&&calif<70) {
						System.out.println(nom + " REPROBÓ");
					}
					else if(calif>0&&calif>=70) {
						System.out.println(nom + " APROBÓ");
					}
				}while(calif<0||calif>100);
				System.out.println();
				
				estudiante[a] = new Estudiante(nom, edad, carrera, calif);
			}
		}else {
			System.out.println("NO SE PEDIRÁN ESTUDIANTES");
		}
	}
	
	//SE PIDEN LOS DATOS DE LOS MAESTROS
	public static void PedirMaestros(Maestro[] maestro) {
		int edad;
		String materia;
		double sueldo;
		if(maestro.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE MAESTROS-");
			for(int b=0; b<maestro.length; b++) {
				System.out.print("NOMBRE DEL MAESTRO " + (b+1) + ": ");
				String nom = Leer.dato();
				//VALIDA QUE SE INGRESE UNA EDAD ENTRE 20 Y 70
				do {
					System.out.print("EDAD DE " + nom + " (20-70): ");
					edad = Leer.datoInt();
					if(edad<20) {
						System.out.println(nom + " NO PUEDE TENER MENOS DE 18 AÑOS...");
					}
					else if(edad>70) {
						System.out.println(nom + " NO PUEDE TENER MÁS DE 70 AÑOS...");
					}else {
						System.out.println(nom + " TIENE " + edad + " AÑOS");
					}
				}while(edad<20||edad>70);
				//VALIDA QUE SE INGRESE UNA MATERIA OPCIONAL
				do {
					System.out.print("MATERIA DE " + nom + " (PROGRAMACIÓN  //  PROBABILIDAD  //  QUIMICA): ");
					materia = Leer.dato();
					if(!materia.equals("PROGRAMACION")&&!materia.equals("PROBABILIDAD")&&!materia.equals("QUIMICA")) {
						System.out.println("MATERIA INVÁLIDA...");
					}
					else {
						System.out.println(nom + " IMPARTE " + materia);
					}
				}while(!materia.equals("PROGRAMACION")&&!materia.equals("PROBABILIDAD")&&!materia.equals("QUIMICA"));
				//VALIDA QUE SE INGRESE UN SUELDO MENSUAL ENTRE 5,000 Y 100,000
				do {
					System.out.print("SUELDO MENSUAL DE " + nom + " (5,000-100,000): " );
					sueldo = Leer.datoDouble();
					if(sueldo<5000) {
						System.out.println(nom + " NO PUEDE GANAR MENOS DE $5,000...");
					}
					else if(sueldo>100000) {
						System.out.println(nom + " NO PUEDE GANAR MÁS DE 100,000...");
					}else { 
						System.out.println(nom + " GANA $" + sueldo + " MENSUALES");
					}
				}while(sueldo<5000||sueldo>100000);
				System.out.println();
				
				maestro[b] = new Maestro(nom, edad, materia, sueldo);
			}
		}else {
			System.out.println("NO SE PEDIRÁN MAESTROS");
		}
	}
	
	//MUESTRA TODOS LOS ALUMNOS SEPARADOS POR CARRERAS
	public static void Carreras(Estudiante[] estudiante) {
		int sist=0, ind=0, amb=0;
		if(estudiante.length!=0) {
			System.out.println();
			System.out.println("-ALUMNOS SEPARADOS POR CARRERA-");
			//CUENTA LOS ALUMNOS DE CADA CARRERA
			for(int c=0; c<estudiante.length; c++) {
				if(estudiante[c].getCarrera().equals("SISTEMAS")) {
					sist++;
				}
				if(estudiante[c].getCarrera().equals("INDUSTRIAL")) {
					ind++;
				}
				if(estudiante[c].getCarrera().equals("AMBIENTAL")) {
					amb++;
				}
			}
			
			//MUESTRA SOLO LOS ALUMNOS DE SISTEMAS
			if(sist==0) {
				System.out.println("SISTEMAS: 0");
				System.out.println("NO HAY");
			}else {
				System.out.println("SISTEMAS: " + sist);
				for(int d=0; d<estudiante.length; d++) {
					if(estudiante[d].getCarrera().equals("SISTEMAS")) {
						System.out.println(estudiante[d].getNombre());
					}
				}
			}
			System.out.println();
			
			//MUESTRA SOLO LOS ALUMNOS DE INDUSTRIAL
			if(ind==0) {
				System.out.println("INDUSTRIAL: 0");
				System.out.println("NO HAY");
			}else {
				System.out.println("INDUSTRIAL: " + ind);
				for(int e=0; e<estudiante.length; e++) {
					if(estudiante[e].getCarrera().equals("INDUSTRIAL")) {
						System.out.println(estudiante[e].getNombre());
					}
				}
			}
			System.out.println();
			
			//MUESTRA SOLO LOS ALUMNOS DE AMBIENTAL
			if(amb==0) {
				System.out.println("AMBIENTAL: 0");
				System.out.println("NO HAY");
			}else {
				System.out.println("AMBIENTAL: " + amb);
				for(int f=0; f<estudiante.length; f++) {
					if(estudiante[f].getCarrera().equals("AMBIENTAL")) {
						System.out.println(estudiante[f].getNombre());
					}
				}
			}
		}
	}
	
	//MUESTRA LOS NOMBRES DE APROBADOS DE CADA CARRERA
	public static void Aprobados(Estudiante[] estudiante) {
		int aprob_sist=0, aprob_ind=0, aprob_amb=0;
		if(estudiante.length!=0) {
			System.out.println();
			System.out.println("-ALUMNOS APROBADOS POR CARRERA-");
			//CUENTA LOS APROBADOS DE CADA CARRERA
			for(int g=0; g<estudiante.length; g++) {
				if(estudiante[g].getCarrera().equals("SISTEMAS")&&estudiante[g].getCalif()>=70) {
					aprob_sist++;
				}
				if(estudiante[g].getCarrera().equals("INDUSTRIAL")&&estudiante[g].getCalif()>=70) {
					aprob_ind++;
				}
				if(estudiante[g].getCarrera().equals("AMBIENTAL")&&estudiante[g].getCalif()>=70) {
					aprob_amb++;
				}
			}
			
			//MUESTRA LOS APROBADOS DE SISTEMAS
			if(aprob_sist==0) {
				System.out.println("SISTEMAS: 0");
				System.out.println("NADIE APROBÓ");
			}else {
				System.out.println("SISTEMAS: " + aprob_sist);
				for(int h=0; h<estudiante.length; h++) {
					if(estudiante[h].getCarrera().equals("SISTEMAS")&&estudiante[h].getCalif()>=70) {
						System.out.println("NOMBRE: " + estudiante[h].getNombre() + ".   CALIFICACIÓN: " + estudiante[h].getCalif());
					}
				}
			}
			System.out.println();
			
			//MUESTRA LOS APROBADOS DE INDUSTRIAL
			if(aprob_ind==0) {
				System.out.println("INDUSTRIAL: 0");
				System.out.println("NADIE APROBÓ");
			}else {
				System.out.println("INDUSTRIAL: " + aprob_ind);
				for(int i=0; i<estudiante.length; i++) {
					if(estudiante[i].getCarrera().equals("INDUSTRIAL")&&estudiante[i].getCalif()>=70) {
						System.out.println("NOMBRE: " + estudiante[i].getNombre() + ".   CALIFICACIÓN: " + estudiante[i].getCalif());
					}
				}
			}
			System.out.println();
			
			//MUESTRA LOS APROBADOS DE AMBIENTAL;
			if(aprob_amb==0) {
				System.out.println("AMBIENTAL: 0");
				System.out.println("NADIE APROBÓ");
			}else {
				System.out.println("AMBIENTAL: " + aprob_amb);
				for(int j=0; j<estudiante.length; j++) {
					if(estudiante[j].getCarrera().equals("AMBIENTAL")&&estudiante[j].getCalif()>=70) {
						System.out.println("NOMBRE: " + estudiante[j].getNombre() + ".   CALIFICACIÓN: " + estudiante[j].getCalif());
					}
				}
			}
		}
	}
	
	//MUESTRA TODOS LOS MAESTROS SEPARADOS POR MATERIAS
	public static void Materias(Maestro[] maestro) {
		int prog=0, prob=0, qui=0;
		if(maestro.length!=0) {
			System.out.println();
			System.out.println("-MAESTROS SEPARADOS POR MATERIA-");
			//CUENTA LOS MAESTROS DE CADA MATERIA
			for(int k=0; k<maestro.length; k++) {
				if(maestro[k].getMateria().equals("PROGRAMACION")) {
					prog++;
				}
				if(maestro[k].getMateria().equals("PROBABILIDAD")) {
					prob++;
				}
				if(maestro[k].getMateria().equals("QUIMICA")) {
					qui++;
				}
			}
			
			//MUESTRA SOLO LOS MAESTROS DE PROGRAMACIÓN
			if(prog==0) {
				System.out.println("PROGRAMACIÓN: 0");
				System.out.println("NO HAY MAESTROS DE PROGRAMACIÓN");
			}else {
				System.out.println("PROGRAMACIÓN: " + prog);
				for(int l=0; l<maestro.length; l++) {
					if(maestro[l].getMateria().equals("PROGRAMACION")) {
						System.out.println(maestro[l].getNombre());
					}
				}
			}
			System.out.println();
			
			//MUESTRA SOLO LOS MAESTROS DE PROBABILIDAD
			if(prob==0) {
				System.out.println("PROBABILIDAD: 0");
				System.out.println("NO HAY MAESTROS DE PROBABILIDAD");
			}else {
				System.out.println("PROBABILIDAD: " + prob);
				for(int m=0; m<maestro.length; m++) {
					if(maestro[m].getMateria().equals("PROBABILIDAD")) {
						System.out.println(maestro[m].getNombre());
					}
				}
			}
			System.out.println();
			
			//MUESTRA SOLO LOS MAESTROS DE QUÍMICA
			if(qui==0) {
				System.out.println("QUÍMICA: 0");
				System.out.println("NO HAY MAESTROS DE QUÍMICA");
			}else {
				System.out.println("QUÍMICA: " + qui);
				for(int n=0; n<maestro.length; n++) {
					if(maestro[n].getMateria().equals("QUIMICA")) {
						System.out.println(maestro[n].getNombre());
					}
				}
			}
		}
	}
	
	//MUESTRA LOS MAESTROS QUE GANAN MÁS DE $20,000 AL MES, POR MATERIA
	public static void MasDe20Mil(Maestro[] maestro) {
		int prog=0, prob=0, qui=0;
		if(maestro.length!=0) {
			System.out.println();
			System.out.println("-MAESTROS QUE GANAN $20,000 O MÁS MENSUALES, POR MATERIA-");
			//SE ACUMULAN LOS MAESTROS CON MÁS DE 20,000 POR MATERIA
			for(int ñ=0; ñ<maestro.length; ñ++) {
				if(maestro[ñ].getMateria().equals("PROGRAMACION")&&maestro[ñ].getSueldo()>=20000) {
					prog++;
				}
				if(maestro[ñ].getMateria().equals("PROBABILIDAD")&&maestro[ñ].getSueldo()>=20000) {
					prob++;
				}
				if(maestro[ñ].getMateria().equals("QUIMICA")&&maestro[ñ].getSueldo()>=20000) {
					qui++;
				}
			}
			
			//SE MUESTRAN SOLO LOS MAESTROS DE PROGRAMACIÓN CON SUELDO IGUAL O MAYOR A 20,000
			if(prog==0) {
				System.out.println("PROGRAMACIÓN: 0");
				System.out.println("NINGÚN MAESTRO GANA MÁS DE $20,000 MENSUALES");
			}else {
				System.out.println("PROGRAMACIÓN: " + prog);
				for(int o=0; o<maestro.length; o++) {
					if(maestro[o].getMateria().equals("PROGRAMACION")&&maestro[o].getSueldo()>=20000) {
						System.out.println("NOMBRE: " + maestro[o].getNombre() + ".   SUELDO: $" + maestro[o].getSueldo());
					}
				}
			}
			System.out.println();
			
			//SE MUESTRAN SOLO LOS MAESTROS DE PROBABILIDAD CON SUELDO IGUAL O MAYOR A 20,000
			if(prob==0) {
				System.out.println("PROBABILIDAD: 0");
				System.out.println("NINGÚN MAESTRO GANA MÁS DE $20,000 MENSUALES");
			}else {
				System.out.println("PROBABIIDAD: " + prob);
				for(int p=0; p<maestro.length; p++) {
					if(maestro[p].getMateria().equals("PROBABILIDAD")&&maestro[p].getSueldo()>=20000) {
						System.out.println("NOMBRE: " + maestro[p].getNombre() + ".   SUELDO: $" + maestro[p].getSueldo());
					}
				}
			}
			System.out.println();
			
			//SE MUESTRAN SOLO LOS MAESTROS DE QUÍMICA CON SUELDO IGUAL O MAYOR A 20,000
			if(qui==0) {
				System.out.println("QUÍMICA: 0");
				System.out.println("NINGÚN MAESTRO GANA MÁS DE $20,000 MENSUALES");
			}else {
				System.out.println("QUÍMICA: " + qui);
				for(int q=0; q<maestro.length; q++) {
					if(maestro[q].getMateria().equals("QUIMICA")&&maestro[q].getSueldo()>=20000) {
						System.out.println("NOMBRE: " + maestro[q].getNombre() + ".   SUELDO: $" + maestro[q].getSueldo());
					}
				}
			}
		}
	}
}