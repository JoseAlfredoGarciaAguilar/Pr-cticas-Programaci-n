package Pr�cticas;
//SE PIDE UN CAR�CTER E IMPRIME SI ES O NO ES UN N�MERO
public class CaracterNum {

	public static void main(String[] args) {
		System.out.print("CAR�CTER: ");
		char carac = Leer.datocar();
		
		if(carac=='0' || carac=='1' || carac=='2' || carac=='3' || carac=='4' || carac=='5' || carac=='6' || carac=='7' || carac=='8' || carac=='9') {
			System.out.println("EL CAR�CTER " + carac + " S� ES UN N�MERO");
		}
		else {
			System.out.println("EL CAR�CTER " + carac + " NO ES UN N�MERO");
		}
	}
}