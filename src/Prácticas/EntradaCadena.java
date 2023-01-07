package Prácticas;

import java.util.Scanner;
//COMO USAR NEXT
public class EntradaCadena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("ESCRIBE UNA CADENA: ");
		String cadena1 = entrada.next(); //NEXT GUARDA LA CADENA SOLO HASTA EL PRIMER ESPACIO. OMITE TODO LO DEMÁS INGRESADO
		//ES DECIR, SOLO GUARDA LA PRIMERA PALABRA INGRESADA
		System.out.println("LA PRIMERA PALABRA ES: " + cadena1);
	}

}
