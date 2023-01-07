package Prácticas;

public class CalculaIMC {

	public static void main(String[] args) {
		System.out.print("PESO EN KG: ");
		double p = Leer.datoDouble();
		System.out.print("ALTURA EN METROS: ");
		double a = Leer.datoDouble();
		double a_cuadrado = Math.pow(a, 2);
		double imc = p / a_cuadrado;
		System.out.println("IMC = " + imc);
	}
}