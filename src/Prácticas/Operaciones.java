package Pr�cticas;
//SE PIDEN 2 N�MEROS Y SE MUESTRA UN MEN� PARA EJECUTAR UNA OPERACI�N
public class Operaciones {

	public static void main(String[] args) {
		int eleccion=0;
		System.out.print("CIFRA 1: ");
		double a = Leer.datoDouble();
		System.out.print("CIFRA 2: ");
		double b = Leer.datoDouble();
		do {
			System.out.println("MEN� DE OPERACIONES: ");
			System.out.println("1- SUMA");
			System.out.println("2- RESTA");
			System.out.println("3- MULTIPLICACI�N");
			System.out.println("4- DIVISI�N");
			System.out.print("ELIGE UNA OPCI�N CON SU N�MERO: ");
			eleccion = Leer.datoInt();
			
			if(eleccion<1 || eleccion>4) {
				System.out.println("OPCI�N INV�LIDA...");
				System.out.println(); 
			}
			
			else if(eleccion==1) {
				Suma(a, b);
			}
			else if(eleccion==2) {
				Resta(a, b);
			}
			else if(eleccion==3) {
				Multiplicacion(a, b);
			}
			else if(eleccion==4) {
				Division(a, b);
			}
		}while(eleccion<1 || eleccion>4);
	}
	
	public static void Suma(double a, double b) {
		double suma = a+b;
		System.out.println("SUMA DE " + a + " + " + b + " = " + suma);
	}
	
	public static void Resta(double a, double b) {
		double resta = a-b;
		System.out.println("RESTA DE " + a + " - " + b + " = " + resta);
	}
	
	public static void Multiplicacion(double a, double b) {
		double multiplicacion = a*b;
		System.out.println("MULTIPLICACI�N DE " + a + " x " + b + " = " + multiplicacion);
	}
	
	public static void Division(double a, double b) {
		double division = a/b;
		System.out.println("DIVISI�N DE " + a + " / " + b + " = " + division);
	}
}