package Pr�cticas;
//SE PIDE EL RADIO DE UN C�RCULO E IMPRIME LA LONGITUD Y EL �REA DE LA CIRCUNFERENCIA
public class Radio {

	public static void main(String[] args) {
		System.out.print("RADIO DEL C�RCULO: ");
		double radio = Leer.datoDouble();
		double longitud = 2*3.1416*radio;
		double area = Math.pow(3.1416*radio, 2);
		System.out.println("LONGITUD DE LA CIRCUNFERENCIA: " + longitud);
		System.out.println("�REA DE LA CIRCUNFERENCIA: " + area);
	}
}