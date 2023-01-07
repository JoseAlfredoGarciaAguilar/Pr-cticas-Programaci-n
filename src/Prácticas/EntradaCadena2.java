package Prácticas;

import java.util.Scanner;
//COMO USAR NEXTLINE
public class EntradaCadena2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("ESCRIBE UNA CADENA: ");
		String cadena2 = entrada.nextLine(); //NEXT LINE GUARDA TODA LA FRASE ESCRITA

		System.out.println("TU FRASE COMPLETA ES: " + cadena2);

	}

}
