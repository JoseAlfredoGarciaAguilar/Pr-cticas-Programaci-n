package Pr�cticas;
//SE PIDE LA LONGITUD DE UN LADO DEL CUBO Y SE MUESTRA SU VOL�MEN
public class VolumenCubo {

	public static void main(String[] args) {
		System.out.println("\tCUBO");
		System.out.print("LONGITUD DE UNO DE SUS LADOS EN METROS: ");
		double la = Leer.datoDouble();
		double vol = la*la*la;
		System.out.println("VOL�MEN DEL CUBO = " + vol + " METROS C�BICOS");
	}
}