package Prácticas;
//GENERA UNA EDAD ALEATORIA Y MUESTRA SI ES MENOR O MAYOR DE EDAD
public class EdadRandom {

	public static void main(String[] args) {
		int ed = (int) (Math.random()*90);
		if(ed==1) {
			System.out.println("1 AÑO. MENOR DE EDAD");
		}
		if(ed>1&&ed<18) {
			System.out.println(ed + " AÑOS. MENOR DE EDAD");
		}
		if(ed>=18) {
			System.out.println(ed + " AÑOS. MAYOR DE EDAD");
		}
	}
}