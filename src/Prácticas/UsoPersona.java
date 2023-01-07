package Pr�cticas;

public class UsoPersona {

	public static void main(String[] args) {
		System.out.println("\tPERSONA");
		//SE PREGUNTAN CU�NTOS EMPLEADOS Y ESTUDIANTES SE VAN A GUARDAR
		System.out.print("�CU�NTOS EMPLEADOS QUIERES AGREGAR?: ");
		int emple = Leer.datoInt();
		System.out.print("�CU�NTOS ESTUDIANTES QUIERES AGREGAR?: ");
		int estu = Leer.datoInt();
		
		//SE GUARDA LA CANTIDAD DE EMPLEADOS Y ESTUDIANTES A GUARDAR
		Empleado[] empleado = new Empleado[emple];
		Estudiante[] estudiante = new Estudiante[estu];
		
		//SE IMPRIME UN MENSAJE CON EL N�MERO DE EMPLEADOS Y ESTUDIANTES A GUARDAR
		if(emple==0 && estu==0) {
			System.out.println("NO SE PEDIR� NADA. FIN DEL PROGRAMA");
		}
		if(emple==1 && estu==1) {
			System.out.println("SE PEDIR� " + emple + " EMPLEADO Y " + estu + " ESTUDIANTE");
		}
		if(emple>1 && estu==1) {
			System.out.println("SE PEDIR�N " + emple + " EMPLEADOS Y " + estu + " ESTUDIANTE");
		}
		if(emple==1 && estu>1) {
			System.out.println("SE PEDIR� " + emple + " EMPLEADO Y " + estu + " ESTUDIANTES");
		}
		if(emple>1 && estu>1) {
			System.out.println("SE PEDIR�N " + emple + " EMPLEADOS Y " + estu + " ESTUDIANTES");
		}
		if(emple==0 && estu==1) {
			System.out.println("SE PEDIR� " + estu + " ESTUDIANTES");
			System.out.println();
		}
		if(emple==0 && estu>1) {
			System.out.println("SE PEDIR�N " + estu + " ESTUDIANTES");
			System.out.println();
		}
		if(emple==1 && estu==0) {
			System.out.println("SE PEDIR� " + emple + " EMPLEADOS");
		}
		if(emple>1 && estu==0) {
			System.out.println("SE PEDIR�N " + emple + " EMPLEADOS");
		}
		
		PedirEmpleados(empleado);
		PedirEstudiantes(estudiante);
	}
	
	//SE PIDEN LOS DATOS DE LOS EMPLEADOS
	public static void PedirEmpleados(Empleado[] empleado) {
		int age=0, degree=0, experience=0;
		double heigth=0, weigth=0, salary=0, bonus=0;
		//SE VALIDA QUE, SI HAY 0 EMPLEADOS, NO SE PIDA NADA
		if(empleado.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE EMPLEADOS-");
			for(int a=0; a<empleado.length; a++) {
				System.out.print("NOMBRE DEL EMPLEADO " + (a+1) + ": ");
				String name = Leer.dato();
				//SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 0 Y 120 A�OS
				do {
					System.out.print("EDAD DE " + name + " EN A�OS: ");
					age = Leer.datoInt();
					if(age<0) {
						System.out.println("NADIE TIENE MENOS DE 0 A�OS. INGRESA OTRA VEZ");
					}
					if(age>120) {
						System.out.println("NADIE TIENE M�S DE 120 A�OS. INGRESA OTRA VEZ");
					}
				}while(age<0 || age>120);
				//SE VALIDA QUE SE INGRESE UNA ESTATURA ENTRE 0.40 Y 2.30 METROS
				do {
					System.out.print("ESTATURA DE " + name + " EN METROS: ");
					heigth = Leer.datoDouble();
					if(heigth<0.40) {
						System.out.println("NADIE MIDE MENOS DE 0.40 METROS. INGRESA OTRA VEZ");
					}
					if(heigth>2.30) {
						System.out.println("NADIE MIDE M�S DE 2.30 METROS. INGRESA OTRA VEZ");
					}
				}while(heigth<0.40 || heigth>2.30);
				//SE VALIDA QUE SE INGRESE UN PESO ENTRE 5 Y 250 KILOS
				do {
					System.out.print("PESO DE " + name + " EN KILOS: ");
					weigth = Leer.datoDouble();
					if(weigth<5) {
						System.out.println("NADIE PESA MENOS DE 5 KILOS. INGRESA OTRA VEZ");
					}
					if(weigth>250) {
						System.out.println("NADIE PESA M�S DE 250 KILOS. INGRESA OTRA VEZ");
					}
				}while(weigth<5 || weigth>250);
				//SE VALIDA QUE SE INGRESE UN SUELDO ENTRE 0 Y 1,000,000 DE PESOS
				do {
					System.out.print("SUELDO MENSUAL DE " + name + " EN PESOS: ");
					salary = Leer.datoDouble();
					if(salary<0) {
						System.out.println("NADIE GANA MENOS DE 0 PESOS AL MES. INGRESA OTRA VEZ");
					}
					if(salary>2000000) {
						System.out.println("NADIE GANA M�S DE 1,000,000 DE PESOS AL MES. INGRESA OTRA VEZ");
					}
				}while(salary<0 || salary>1000000);
				//SE VALIDA QUE SE INGRESE UN AGUINALDO ENTRE 0 Y 1,000,000 DE PESOS
				do {
					System.out.print("AGUINALDO ANUAL DE " + name + " EN PESOS: ");
					bonus = Leer.datoDouble();
					if(bonus<0) {
						System.out.println("NADIE TIENE UN AGUINALDO MENOR A $0. INGRESA OTRA VEZ");
					}
					if(bonus>1000000) {
						System.out.println("NADIE TIENE UN AGUINALDO MAYOR A $1,000,000. INGRESA OTRA VEZ");
					}
				}while(bonus<0 || bonus>1000000);
				//SE VALIDA QUE SE ELIJA UN T�TULO DE LAS OPCIONES
				do {
					System.out.print("T�TULO PROFESIONAL DE " + name + ":   1-ING. SISTEMAS   2-ING. TICS   3-ING. INDUSTRIAL   4-ING. BIOQU�MICA   5-ING. GESTI�N: ");
					degree = Leer.datoInt();
					if(degree<=0 || degree>5) {
						System.out.println("T�TULO PROFESIONAL INV�LIDO. INGRESA OTRA VEZ");
					}
				}while(degree<=0 || degree>5);
				//SE VALIDA QUE INGRESE UNA EXPERIENCIA ENTRE 0 Y 60 A�OS
				do {
					System.out.print("EXPERIENCIA LABORAL DE " + name + " EN A�OS: ");
					experience = Leer.datoInt();
					if(experience<0) {
						System.out.println("NADIE TIENE MENOS DE 0 A�OS DE EXPERIENCIA. INGRESA OTRA VEZ");
					}
					if(experience>60) {
						System.out.println("NADIE TIENE M�S DE 60 A�OS DE EXPERIENCIA. INGRESA OTRA VEZ");
					}
				}while(experience<0 || experience>60);
				
				//SE GUARDAN LOS DATOS DEL O LOS EMPLEADOS
				empleado[a] = new Empleado(name, age, heigth, weigth, salary, bonus, degree, experience);
				System.out.println();
			}
		}
	}
	
	//SE PIDEN LOS DATOS DE LOS ESTUDIANTES
	public static void PedirEstudiantes(Estudiante[] estudiante) {
		int age=0, semester=0, career=0, scholarship=0;
		double heigth=0, weigth=0, average=0;
		if(estudiante.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE ESTUDIANTES-");
			for(int b=0; b<estudiante.length; b++) {
				System.out.print("NOMBRE DEL ESTUDIANTE " + (b+1) + ": ");
				String name = Leer.dato();
				//SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 0 Y 120 A�OS
				do {
					System.out.print("EDAD DE " + name + " EN A�OS: ");
					age = Leer.datoInt();
					if(age<0) {
						System.out.println("NADIE TIENE MENOS DE 0 A�OS. INGRESA OTRA VEZ");
					}
					if(age>120) {
						System.out.println("NADIE TIENE M�S DE 120 A�OS. INGRESA OTRA VEZ");
					}
				}while(age<0 || age>120);
				//SE VALIDA QUE SE INGRESE UNA ESTATURA ENTRE 0.40 Y 2.30 METROS
				do {
					System.out.print("ESTATURA DE " + name + " EN METROS: ");
					heigth = Leer.datoDouble();
					if(heigth<0.40) {
						System.out.println("NADIE MIDE MENOS DE 0.40 METROS. INGRESA OTRA VEZ");
					}
					if(heigth>2.30) {
						System.out.println("NADIE MIDE M�S DE 2.30 METROS. INGRESA OTRA VEZ");
					}
				}while(heigth<0.40 || heigth>2.30);
				//SE VALIDA QUE SE INGRESE UN PESO ENTRE 5 Y 250 KILOS
				do {
					System.out.print("PESO DE " + name + " EN KILOS: ");
					weigth = Leer.datoDouble();
					if(weigth<5) {
						System.out.println("NADIE PESA MENOS DE 5 KILOS. INGRESA OTRA VEZ");
					}
					if(weigth>250) {
						System.out.println("NADIE PESA M�S DE 250 KILOS. INGRESA OTRA VEZ");
					}
				}while(weigth<5 || weigth>250);
				//SE VALIDA QUE SE INGRESE UN PROMEDIO SEMESTRAL ENTRE 0 Y 100
				do {
					System.out.print("PROMEDIO SEMESTRAL DE " + name + " DEL 0 AL 100: ");
					average = Leer.datoDouble();
					if(average<0) {
						System.out.println("NADIE PROMEDIA MENOS DE 0. INGRESA OTRA VEZ");
					}
					if(average>100) {
						System.out.println("NADIE PROMEDIA M�S DE 100. INGRESA OTRA VEZ");
					}
				}while(average<0 || average>100);
				//SE VALIDA QUE SE INGRESE UN SEMESTRE ENTRE 0 Y 12
				do {
					System.out.print("N�MERO DE SEMESTRE QUR CURSA " + name + " DEL 0 AL 12: ");
					semester = Leer.datoInt();
					if(semester<0) {
						System.out.println("NADIE VA EN UN SEMESTRE MENOR QUE 0. INGRESA OTRA VEZ");
					}
					if(semester>12) {
						System.out.println("NADIE VA EN UN SEMESTRE MAYOR A 12. INGRESA OTRA VEZ");
					}
				}while(semester<0 || semester>12);
				//SE VALIDA QUE SE ELIJA UNA CARRERA DE LAS OPCIONES
				do {
					System.out.print("CARRERA DE " + name + ": 1-ING. SISTEMAS   2-ING. TICS   3-ING. INDUSTRIAL   4-ING. BIOQU�MICA   5-ING. GESTI�N:");
					career = Leer.datoInt();
					if(career<=0 || career>5) {
						System.out.println("CARRERA INV�LIDA. INGRESA OTRA VEZ");
					}
				}while(career<=0 || career>5);
				//SE VALIDA QUE SE ELIJA UNA OPCI�N V�LIDA
				do {
					System.out.print("�" + name + " TIENE BECA?: ");
					scholarship = Leer.datoInt();
					if(scholarship<0 || scholarship>2) {
						System.out.println("OPCI�N INV�LIDA. INGRESA OTRA VEZ");
					}
				}while(scholarship<0 || scholarship>2);
				
				//SE GUARDAN LOS DATOS DEL O LOS ESTUDIANTES
				estudiante[b] = new Estudiante(name, age, heigth, weigth, average, semester, career, scholarship);
				System.out.println();
			}
		}
	}
}