package Pr�cticas;
//PIDE UN N�MERO Y CALCULA SU RA�Z CUADRADA
public class RaizCuadrada {

	public static void main(String[] args) {
		System.out.print("N�MERO PARA SACAR LA RA�Z CUADRADA: ");
		double x = Leer.datoDouble();
		double raiz = Math.sqrt(x);
		System.out.println("RA�Z CUADRADA DE " + x + " = " + raiz);
	}
}