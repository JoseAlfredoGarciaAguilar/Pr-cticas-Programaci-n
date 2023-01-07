package Prácticas;
//ENCUENTRA EL NÚMERO MAYOR Y MENOR DE UN ARREGLO DE N ELEMENTOS
public class MayorMenor {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTOS DÍGITOS SON?: ");
		int x = Leer.datoInt();
		
		int[] v = new int[x];
		
		for(int i=0; i<v.length; i++) {
			System.out.print("DÍGITO " + (i+1) + ": ");
			v[i] = Leer.datoInt();
		}
		
		int mayor=0, menor=0;
		mayor=menor=v[0];
		
		for(int j=0; j<v.length; j++) {
			if(v[j]>mayor) {
				mayor=v[j];
			}
			if(v[j]<menor) {
				menor=v[j];
			}
		}
		System.out.println();
		System.out.println("MAYOR: " + mayor);
		System.out.println("MENOR: " + menor);
	}
}