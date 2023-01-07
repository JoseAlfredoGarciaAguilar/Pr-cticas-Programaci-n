package Prácticas;
//SE PIDE UN NÚMERO ENTERO E IMPRIME SU DOBLE Y SU TRIPLE
public class DobleTriple {

	public static void main(String[] args) {
		System.out.print("CIFRA ENTERA: ");
		int cifra = Leer.datoInt();
		
		System.out.println("DOBLE DE " + cifra + ": " + cifra*2);
		System.out.println("TRIPLE DE " + cifra + ": " + cifra*3);
	}
}