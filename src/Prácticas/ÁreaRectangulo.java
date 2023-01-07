package Prácticas;
//SE PIDE EL ANCHO Y LARGO DE UN RECTÁNGULO Y MUESTRA SU ÁREA
public class ÁreaRectangulo {

	public static void main(String[] args) {
		System.out.println("RECTÁNGULO");
		System.out.print("LONGITUD DEL ANCHO EN METROS: ");
		double an = Leer.datoDouble();
		System.out.print("LONGITUD DEL LARGO EN METROS: ");
		double la = Leer.datoDouble();
		double area = an*la;
		System.out.println("ÁREA DEL RECTÁNGULO = " + area + " METROS CUADRADOS");
	}
}