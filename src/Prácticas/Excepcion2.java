package Prácticas;
import java.util.Scanner;

public class Excepcion2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N=0;
		System.out.print("ESCRIBE UN NÚMERO ENTERO: ");
		try {
			N = entrada.nextInt();
		}catch(Exception a) {
			System.out.println("NO ESCRIBISTE UN NÚMERO ENTERO");
		}
		finally {
			System.out.println("PROCESO TERMINADO");
		}
	}
}