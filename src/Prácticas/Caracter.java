package Pr�cticas;
//SE PIDEN DOS CAR�CTERES E IMPRIME SI SON IGUALES O DIFERENTES
public class Caracter {

	public static void main(String[] args) {
		System.out.print("CAR�CTER 1: ");
		char caracter1 = Leer.datocar();
		System.out.print("CAR�CTER 2: ");
		char caracter2 = Leer.datocar();
		
		if(caracter1 == caracter2) {
			System.out.println(caracter1 + " Y " + caracter2 + " SON IGUALES");
		}
		else {
			System.out.println(caracter1 + " Y " + caracter2 + " NO SON IGUALES");
		}
	}
}