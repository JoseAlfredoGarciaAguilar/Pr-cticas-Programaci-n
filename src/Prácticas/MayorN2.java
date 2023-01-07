package Prácticas;
//SE PIDEN N NÚMEROS Y SE MUESTRA EL MAYOR DE TODOS
public class MayorN2 {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTOS NÚMEROS VAS A INGRESAR?: ");
		int N = Leer.datoInt();
		int mayor=0;
		int[] arreglo = new int[N];
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.print("NÚMERO " + (i+1) + ": ");
			arreglo[i] = Leer.datoInt();
		}
		
		for(int j=0; j<arreglo.length; j++) {
			if(arreglo[j] > mayor) {
				mayor = arreglo[j];
			}
		}
		System.out.print("EL NÚMERO MAYOR ES " + mayor);
	}
}