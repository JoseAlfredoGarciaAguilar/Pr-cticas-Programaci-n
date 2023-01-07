package Prácticas;
//SE PIDE LA LONGITUD DE UN CUADRADO Y SE MUESTRA SU ÁREA
public class AreaCuadrado {

	public static void main(String[] args) {
		System.out.println("CUADRADO");
		System.out.print("LONGITUD DE UN LADO EN METROS: ");
		double m = Leer.datoDouble();
		double area = m*m;
		System.out.print("ÁREA DEL CUADRADO = " + area + " METROS CUADRADOS");
	}
}