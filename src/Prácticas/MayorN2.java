package Pr�cticas;
//SE PIDEN N N�MEROS Y SE MUESTRA EL MAYOR DE TODOS
public class MayorN2 {

	public static void main(String[] args) {
		System.out.print("�CU�NTOS N�MEROS VAS A INGRESAR?: ");
		int N = Leer.datoInt();
		int mayor=0;
		int[] arreglo = new int[N];
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.print("N�MERO " + (i+1) + ": ");
			arreglo[i] = Leer.datoInt();
		}
		
		for(int j=0; j<arreglo.length; j++) {
			if(arreglo[j] > mayor) {
				mayor = arreglo[j];
			}
		}
		System.out.print("EL N�MERO MAYOR ES " + mayor);
	}
}