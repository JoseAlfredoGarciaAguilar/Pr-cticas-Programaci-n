package Prácticas;

public class Intercambio {

	public static void main(String[] args) {
		double aux;
		System.out.print("VALOR DE A: ");
		double a = Leer.datoDouble();
		System.out.print("VALOR DE B: ");
		double b = Leer.datoDouble();
		
		System.out.println();
		System.out.println("VALORES ORIGINALES");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println();
		System.out.println("VALORES INTERCAMBIADOS");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
	}
}