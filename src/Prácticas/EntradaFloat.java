package Prácticas;
import java.util.Scanner;

public class EntradaFloat {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("INGRESA UN NÚMERO DECIMAL: ");
		float num = teclado.nextFloat();
		
		System.out.println("ESCRIBISTE EL NÚMERO " + num);
	}
}