package Pr�cticas;
//PIDE ANCHO Y LARGO DE N RECTANGULOS, E IMPRIME EL DE MAYOR �REA
public class MayorArea {

	public static void main(String[] args) {
		double ancho = 0, largo = 0, area = 0, area_mayor = 0;
		String nom_mayor = "";
		System.out.print("�CU�NTOS RECT�NGULOS VAS A AGREGAR?: ");
		int x = Leer.datoInt();
		
		//SE PIDEN LOS DATOS
		for(int i=1; i<=x; i++) {
			System.out.print("COLOR DEL RECT�NGULO "+ i +": ");
			String nom = Leer.dato();
			System.out.print("ANCHO DEL RECT�NCULO "+ i +" EN CM: ");
			ancho = Leer.datoDouble();
			System.out.print("LARGO DEL RECT�NGULO "+ i +" EN CM: ");
			largo = Leer.datoDouble();
			System.out.println();
			area = ancho * largo;
			
			//SE BUSCA EL �REA DE MAYOR TAMA�O Y SE LE ASIGNA SU NOMBRE
			if(area > area_mayor) {
				area_mayor = area;
				nom_mayor = nom;
			}
		}
		System.out.println("RECT�NGULO DE MAYOR �REA: " + nom_mayor + ", CON " + area_mayor + " CMS CUADRADOS");
	}
}