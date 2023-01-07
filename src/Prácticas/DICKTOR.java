//PROGRAMA QUE PREGUNTA SI CHECHO ES JOTO, SI DICE QUE SI INCREMENTA EL NUMERO DE TETAS DE VICTOR, SINO, SALE Y TE LAS MUESTRA 7u7
package Prácticas;
import java.util.Scanner;

public class DICKTOR {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int entrada, contador=0;
		do {
			System.out.print("¿CHECHO ES JOTO? (1=SI, 2=NO): ");
			entrada = e.nextInt();
			if(entrada!=1) {
				System.out.println("INGRESE UNA RESPUESTA VÁLIDA, OBVIAMENTE CHECHO ES JOTO");
				contador++;
			}
			if(entrada==1) {
				System.out.println("¡BIEN!, OBVIAMENTE CHECHO ES JOTO");
			}
		}while(entrada!=1);
		
		System.out.println("VICTOR TIENE " + contador + " TETAS");
	}
}