package Pr�cticas;
//SE PIDE EL ANCHO Y LARGO DE UN RECT�NGULO Y MUESTRA SU �REA
public class �reaRectangulo {

	public static void main(String[] args) {
		System.out.println("RECT�NGULO");
		System.out.print("LONGITUD DEL ANCHO EN METROS: ");
		double an = Leer.datoDouble();
		System.out.print("LONGITUD DEL LARGO EN METROS: ");
		double la = Leer.datoDouble();
		double area = an*la;
		System.out.println("�REA DEL RECT�NGULO = " + area + " METROS CUADRADOS");
	}
}