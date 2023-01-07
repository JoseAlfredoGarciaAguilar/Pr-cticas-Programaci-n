package Prácticas;
import java.util.Scanner;
//COMO USAR CHARAT
public class charAt {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("INGRESA UNA PALABRA: ");
		String palabra = entrada.next();
		char x = palabra.charAt(0); //CHARAT SIRVE PARA OBTENER LA LETRA DE UNA PALABRA EN UNA DETERMINADA POSICIÓN
		//EN ESTE CASO QUIERO LA LETRA DE LA POSICION 0. POR EJEMPLO, SI ESCRIBO FERNANDA, ME MOSTRARÁ LA LETRA F
		System.out.println("LA PRIMERA LETRA DE LA PALABRA QUE INGRESASTE ES: " + x);
	}
}