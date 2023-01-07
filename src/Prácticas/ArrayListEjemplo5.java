package Prácticas;
import java.util.ArrayList;

public class ArrayListEjemplo5 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();

		color.add("AZUL");
		color.add("BLANCO");
		color.add("ROJO");
		color.add("CAFÉ");
		color.add("GRIS");
		color.add("VERDE");
		color.add("AMARILLO");
		color.add("NARANJA");
		
		//SE IMPRIME EN FORMA DE LISTA
		for(int a=0; a<color.size(); a++) {
			System.out.println(color.get(a));
		}
		
		//SE IMPRIME EN UNA SOLA COLUMNA
		System.out.println();
		System.out.println(color);
		
		//SE ELIMINA UN ELEMENTO
		System.out.println();
		color.remove(5);
		//SE IMPRIME EN FORMA DE COLUMNA
		for(int b=0; b<color.size(); b++) {
			System.out.println(color.get(b));
		}
		//SE IMPRIME EN UNA SOLA COLUMNA
		System.out.println();
		System.out.println(color);
		
		//.CONTAINS IMPRIME SI ESE ELEMENTO EXISTE, CON UN TRUE O FALSE
		System.out.println();
		System.out.println(color.contains("ROJO"));
		System.out.println(color.contains("TINTO"));
		System.out.println(color.contains("VERDE"));
		
		//.SUBLIST IMPRIME LOS ELEMENTOS ENTRE UN SUBÍNDICE Y OTRO, EN ESTE CASO DESDE LA POSICIÓN 4 HASTA LA 7
		System.out.println();
		System.out.println(color.subList(4, 7));
		
		//IMPRIME CUÁNTOS ELEMENTOS HAY
		System.out.println("HAY " + color.size() + " ELEMENTOS");
		
		//.CLEAR ELIMINA TODOS LOS ELEMENTOS DEL ARRAYLIST. POR ESO SE IMPRIME VACÍO
		color.clear();
		System.out.println();
		//IMPRIME QUE HAY 0 ELEMENTOS PORQUE SE BORRARON TODOS CON EL .CLEAR
		System.out.println("HAY " + color.size() + " ELEMENTOS");
	}
}