package Pr�cticas;
//IMPRIME UN MENSAJE N VECES
public class MensajeN {

	public static void main(String[] args) {
		System.out.print("�QU� MENSAJE VAS A MOSTRAR?: ");
		String mens = Leer.dato();
		System.out.print("�CU�NTAS VECES VAS A MOSTRARLO?: ");
		int x = Leer.datoInt();
		
		for(int i=1; i<=x; i++) {
			System.out.println(mens);
		}
	}
}