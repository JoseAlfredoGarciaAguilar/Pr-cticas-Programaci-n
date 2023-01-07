package Prácticas;
//SE PIDE UN CARÁCTER E IMPRIME SI ES O NO ES UN NÚMERO
public class CaracterNum {

	public static void main(String[] args) {
		System.out.print("CARÁCTER: ");
		char carac = Leer.datocar();
		
		if(carac=='0' || carac=='1' || carac=='2' || carac=='3' || carac=='4' || carac=='5' || carac=='6' || carac=='7' || carac=='8' || carac=='9') {
			System.out.println("EL CARÁCTER " + carac + " SÍ ES UN NÚMERO");
		}
		else {
			System.out.println("EL CARÁCTER " + carac + " NO ES UN NÚMERO");
		}
	}
}