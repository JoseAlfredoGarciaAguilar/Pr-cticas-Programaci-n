package Pr�cticas;
//SE PIDE UN N�MERO ENTERO Y SE IMPRIME SI ES PAR O IMPAR
public class Par {

	public static void main(String[] args) {
		System.out.print("INGRESE EL N�MERO: ");
		int num = Leer.datoInt();
		
		if(num%2==0) {
			System.out.println(num + " ES PAR");
		}
		else {
			System.out.println(num + " ES IMPAR");
		}
	}
}