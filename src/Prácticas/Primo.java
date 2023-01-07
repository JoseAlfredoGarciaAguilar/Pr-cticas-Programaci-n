package Prácticas;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digita un número: ");
		int x = entrada.nextInt();
		int k=0;

		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				k++;
			}
		}
		
		if(k==2) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}

}
