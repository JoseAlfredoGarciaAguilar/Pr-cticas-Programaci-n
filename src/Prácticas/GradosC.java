package Pr�cticas;
//SE PIDEN GRADOS CENT�GRADOS Y SE IMPRIMEN EN FAHRENHEIT
public class GradosC {

	public static void main(String[] args) {
		System.out.print("GRADOS CENT�GRADOS: ");
		double centi = Leer.datoDouble();
		
		double fahre = 32 + (9*centi/5);
		System.out.println("CONVERTIDO A FAHRENHEIT: " + fahre + "�F");
	}
}