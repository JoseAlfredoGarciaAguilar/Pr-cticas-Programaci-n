package Pr�cticas;
//SE INGRESAN N N�MEROS CUALESQUIERA Y SE IMPRIMEN SOLO LOS ENTEROS
public class NumEnteros {

	public static void main(String[] args) {
		System.out.print("�CU�NTOS N�MEROS VAS A INGRESAR?: ");
		int num = Leer.datoInt();
		double[] x = new double[num];
		
		System.out.println();
		System.out.println("CAPTURA DE " + x.length + " N�MEROS: ");
		for(int i=0; i<x.length; i++) {
			System.out.print("N�MERO " + (i+1) + ": ");
			x[i] = Leer.datoDouble();
		}
		
		System.out.println();
		System.out.println("LOS N�MEROS ENTEROS SON: ");
		for(int j=0; j<x.length; j++) {
			if(x[j] %1 == 0) {
				System.out.println(x[j]);
			}
		}
	}
}