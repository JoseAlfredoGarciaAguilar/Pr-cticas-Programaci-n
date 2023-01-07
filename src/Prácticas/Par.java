package Prácticas;
//SE PIDE UN NÚMERO ENTERO Y SE IMPRIME SI ES PAR O IMPAR
public class Par {

	public static void main(String[] args) {
		System.out.print("INGRESE EL NÚMERO: ");
		int num = Leer.datoInt();
		
		if(num%2==0) {
			System.out.println(num + " ES PAR");
		}
		else {
			System.out.println(num + " ES IMPAR");
		}
	}
}