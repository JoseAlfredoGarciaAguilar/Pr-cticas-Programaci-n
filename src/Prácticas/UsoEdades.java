package Pr�cticas;
//SE INGRESAN N PERSONAS CON SUS NOMBRES Y EDADES. IMPRIME CU�NTOS MENORES Y MAYORES DE EDAD HAY. ADEM�S IMPRIME LOS NOMBRES Y EDADES DE LOS MENORES Y MAYORES DE EDAD
public class UsoEdades {

	public static void main(String[] args) {
		System.out.println("\tEDADES");
		System.out.print("CANTIDAD DE PERSONAS A INGRESAR: ");
		int N = Leer.datoInt();
		
		Edades[] edades = new Edades[N];
		
		if(edades.length==0) {
			System.out.println("-NO SE PEDIR� NADA. FIN DEL PROGRAMA-");
		}
		
		PedirDatos(edades);
		MostrarTodos(edades);
		MenoresDeEdad(edades);
		MayoresDeEdad(edades);
	}
	
	//SE PIDEN LOS DATOS DE LAS PERSONAS
	public static void PedirDatos(Edades[] edades) {
		int ed=0;
		//SE VALIDA QUE, SI SE INGRESAN 0 PERSONAS, NO SE PIDA NADA
		if(edades.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE PERSONAS-");
			for(int a=0; a<edades.length; a++) {
				System.out.print("NOMBRE " + (a+1) + ": ");
				String nom = Leer.dato();
				//SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 1 Y 130 A�OS
				do {
					System.out.print("EDAD DE " + nom + ": ");
					ed = Leer.datoInt();
					if(ed<1) {
						System.out.println("POSIBLEMENTE " + nom + " SEA UN BEB�. PERO PRUEBA DE NUEVO");
					}
					if(ed>130) {
						System.out.println("NADIE ES TAN VIEJO PARA TENER M�S DE 130 A�OS. PRUEBA DE NUEVO");
					}
				}while(ed<1 || ed>130);
				System.out.println();
				
				edades[a] = new Edades(nom, ed);
			}
		}
	}
	
	//SE IMPRIMEN TODOS LOS DATOS
	public static void MostrarTodos(Edades[] edades) {
		//SE VALIDA QUE, SI SE INGRESAN 0 PERSONAS, NO SE IMPRIMA NADA
		if(edades.length!=0) {
			System.out.println("-TODAS LAS PERSONAS-");
			for(int b=0; b<edades.length; b++) {
				System.out.println(edades[b].ToStringDatos());
			}
		}
	}
	
	//SE IMPRIMEN SOLO LOS DATOS DE LAS PERSONAS MENORES DE EDAD
	public static void MenoresDeEdad(Edades[] edades) {
		String salida="";
		int menores=0;
		//SE BUSCA EN EL ARREGLO LA CANTIDAD DE PERSONAS MENORES DE 18 A�OS PARA CONTARLAS
		for(int c=0; c<edades.length; c++) {
			if(edades[c].getEdad() < 18) {
				menores++;
			}
		}
		//SE VALIDA QUE, SI NO HAY PERSONAS MENORES DE 18 A�OS, NO SE IMPRIMA NADA
		if(menores!=0) {
			System.out.println();
			System.out.println("-PERSONAS MENORES DE EDAD-");
			//SE IMPRIME LA CANTIDAD DE PERSONAS MENORES DE 18 A�OS
			System.out.println(menores + " PERSONAS");
			for(int d=0; d<edades.length; d++) {
				if(edades[d].getEdad() < 18) {
					salida = edades[d].getNombre() + ", CON " + edades[d].getEdad() + " A�OS";
					System.out.println(salida);
					}
				}
		}
	}
	
	//SE IMPRIMEN SOLO LOS DATOS DE LAS PERSONAS MAYORES DE EDAD
	public static void MayoresDeEdad(Edades[] edades) {
		String salida="";
		int mayores=0;
		//SE BUSCA EN EL ARREGLO LA CANTIDAD DE PERSONAS IGUALES O MAYORES DE 18 A�OS PARA CONTARLAS
		for(int e=0; e<edades.length; e++) {
			if(edades[e].getEdad() >= 18) {
				mayores++;
			}
		}
		//SE VALIDA QUE, SI NO HAY PERSONAS IGUALES O MAYORES DE 18 A�OS, NO SE IMPRIMA NADA
		if(mayores!=0) {
			System.out.println();
			System.out.println("-PERSONAS MAYORES DE EDAD-");
			//SE IMPRIME LA CANTIDAD DE PERSONAS IGUALES O MAYORES DE 18 A�OS
			System.out.println(mayores + " PERSONAS");
			for(int d=0; d<edades.length; d++) {
				if(edades[d].getEdad() >= 18) {
					salida = edades[d].getNombre() + ", CON " + edades[d].getEdad() + " A�OS";
					System.out.println(salida);
					}
				}
			}
		}
	}