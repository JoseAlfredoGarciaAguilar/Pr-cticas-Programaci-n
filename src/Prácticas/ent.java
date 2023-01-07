package Prácticas;

import java.util.Scanner;

public class ent {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cuantos = 0;
		do {
			System.out.print("¿CUÁNTOS VALORES CODIFICADORES USARÁS?: ");
			cuantos = entrada.nextInt();
		}while(cuantos<=0||cuantos%1!=0);

	}

}
