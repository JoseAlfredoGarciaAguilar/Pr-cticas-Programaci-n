package Pr�cticas;
import java.util.Scanner;

public class EntradaFloat {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("INGRESA UN N�MERO DECIMAL: ");
		float num = teclado.nextFloat();
		
		System.out.println("ESCRIBISTE EL N�MERO " + num);
	}
}