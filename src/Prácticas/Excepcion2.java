package Pr�cticas;
import java.util.Scanner;

public class Excepcion2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N=0;
		System.out.print("ESCRIBE UN N�MERO ENTERO: ");
		try {
			N = entrada.nextInt();
		}catch(Exception a) {
			System.out.println("NO ESCRIBISTE UN N�MERO ENTERO");
		}
		finally {
			System.out.println("PROCESO TERMINADO");
		}
	}
}