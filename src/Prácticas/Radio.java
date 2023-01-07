package Prácticas;
//SE PIDE EL RADIO DE UN CÍRCULO E IMPRIME LA LONGITUD Y EL ÁREA DE LA CIRCUNFERENCIA
public class Radio {

	public static void main(String[] args) {
		System.out.print("RADIO DEL CÍRCULO: ");
		double radio = Leer.datoDouble();
		double longitud = 2*3.1416*radio;
		double area = Math.pow(3.1416*radio, 2);
		System.out.println("LONGITUD DE LA CIRCUNFERENCIA: " + longitud);
		System.out.println("ÁREA DE LA CIRCUNFERENCIA: " + area);
	}
}