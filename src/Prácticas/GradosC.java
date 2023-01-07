package Prácticas;
//SE PIDEN GRADOS CENTÍGRADOS Y SE IMPRIMEN EN FAHRENHEIT
public class GradosC {

	public static void main(String[] args) {
		System.out.print("GRADOS CENTÍGRADOS: ");
		double centi = Leer.datoDouble();
		
		double fahre = 32 + (9*centi/5);
		System.out.println("CONVERTIDO A FAHRENHEIT: " + fahre + "°F");
	}
}