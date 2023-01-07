package Prácticas;

public class UsoMixup {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTOS CD'S SON?: ");
		int num_cd = Leer.datoInt();
		System.out.print("¿CUÁNTOS DVD'S SON?: ");
		int num_dvd = Leer.datoInt();
		
		Cd[] cd = new Cd[num_cd];
		Dvd[] dvd = new Dvd[num_dvd];
	}
	
	public static void PedirCd(Cd[] cd) {
		System.out.println("CAPTURA DE CDS");
		for(int a=0; a<cd.length; a++) {
			System.out.print("NÚMERO DE CDS: ");
			int piezas = Leer.datoInt();
			System.out.print("PRECIO POR CDS: ");
			double precio = Leer.datoDouble();
			System.out.print("NOMBRE DEL ARTISTA: ");
			String artista = Leer.dato();
			System.out.print("NÚMERO DE CANCIONES DEL CD: ");
			int canciones = Leer.datoInt();
		}
	}
}