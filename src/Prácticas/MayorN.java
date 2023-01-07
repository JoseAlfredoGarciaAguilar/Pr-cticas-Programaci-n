package Prácticas;
//SE PIDEN 3 NÚMEROS Y SE MUESTRA CUÁL DE LOS 3 ES EL MAYOR
public class MayorN {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("INGRESA EL NÚMERO " + (i+1) + ": ");
			arr[i] = Leer.datoInt();
		}
		
		if(arr[0] > arr[1] && arr[0] > arr[2]) {
			System.out.println("EL NÚMERO MAYOR ES " + arr[0]);
		}
		else if(arr[1] > arr[0] && arr[1] > arr[2]) {
			System.out.println("EL NÚMERO MAYOR ES " + arr[1]);
		}
		else if(arr[2] > arr[0] && arr[2] > arr[1]) {
			System.out.println("EL NÚMERO MAYOR ES " + arr[2]);
		}
	}
}