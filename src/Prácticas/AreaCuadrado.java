package Pr�cticas;
//SE PIDE LA LONGITUD DE UN CUADRADO Y SE MUESTRA SU �REA
public class AreaCuadrado {

	public static void main(String[] args) {
		System.out.println("CUADRADO");
		System.out.print("LONGITUD DE UN LADO EN METROS: ");
		double m = Leer.datoDouble();
		double area = m*m;
		System.out.print("�REA DEL CUADRADO = " + area + " METROS CUADRADOS");
	}
}