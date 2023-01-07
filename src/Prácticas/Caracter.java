package Prácticas;
//SE PIDEN DOS CARÁCTERES E IMPRIME SI SON IGUALES O DIFERENTES
public class Caracter {

	public static void main(String[] args) {
		System.out.print("CARÁCTER 1: ");
		char caracter1 = Leer.datocar();
		System.out.print("CARÁCTER 2: ");
		char caracter2 = Leer.datocar();
		
		if(caracter1 == caracter2) {
			System.out.println(caracter1 + " Y " + caracter2 + " SON IGUALES");
		}
		else {
			System.out.println(caracter1 + " Y " + caracter2 + " NO SON IGUALES");
		}
	}
}