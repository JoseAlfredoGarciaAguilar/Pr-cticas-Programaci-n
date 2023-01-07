package Prácticas;
//PREGUNTA EN CUANTO ESTA TU GFA. VALIDA QUE SOLO SE PONGA EN 4 ASIES
public class tugfa {

	public static void main(String[] args) {
		int cuanto;
		do{
			System.out.print("¿EN CUÁNTO ESTÁ TU GFA?: ");
			cuanto = Leer.datoInt();
			if(cuanto!=4) {
				System.out.println("NO SEAS PENDEJA, TU GFA DEBE ESTAR EN 4...");
			}else{
				System.out.println("CUANDO ALGUIEN DICE TOP SE ME PONE DURO EL RIFLE ASIES ALV");
			}
		}while(cuanto!=4);
	}
}