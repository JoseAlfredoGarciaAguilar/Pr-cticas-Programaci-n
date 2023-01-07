package Prácticas;
//CALCULA EL VOLUMEN DE UNA ESFERA
public class Esfera {

	public static void main(String[] args) {
		System.out.print("VALOR DE SU RADIO EN CM: ");
		double r = Leer.datoDouble();
		double r_al_cubo = Math.pow(r, 3);
		double volumen_esfera = (4*3.141526535*r_al_cubo)/3;
		System.out.print("VOLÚMEN DE LA ESFERA: " + volumen_esfera + "CM CÚBICOS");
	}
}