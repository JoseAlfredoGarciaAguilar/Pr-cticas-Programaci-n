package Prácticas;
//PIDE UN NÚMERO Y CALCULA SU RAÍZ CUADRADA
public class RaizCuadrada {

	public static void main(String[] args) {
		System.out.print("NÚMERO PARA SACAR LA RAÍZ CUADRADA: ");
		double x = Leer.datoDouble();
		double raiz = Math.sqrt(x);
		System.out.println("RAÍZ CUADRADA DE " + x + " = " + raiz);
	}
}