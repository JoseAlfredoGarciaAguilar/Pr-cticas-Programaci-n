package Prácticas;
import java.util.ArrayList;

public class ArrayListEjemplo3 {

	public static void main(String[] args) {
		ArrayList<String> variable = new ArrayList<String>();
		
		variable.add("HUGO");
		variable.add("CARLA");
		variable.add("OLIVIA");
		variable.add("JESÚS");
		variable.add("ARTURO");
		variable.add("WILLIAM");
		variable.add("DIEGO");
		variable.add("EDDIE");

		//IMPRIME TODOS LOS ELEMENTOS ENTRE CORCHETES
		System.out.println(variable);
		
		//SE ELIMINA UN ELEMENTO CON .REMOVE, EN ESTE CASO LA POSICIÓN 4
		System.out.println();
		variable.remove(4);
		System.out.println(variable);
		
		//.CONTAINS BUSCA SI EN EL ARRAYLIST EXISTE EL ELEMENTO INDICADO, IMPRIMIÉNDOLO CON UN TRUE O FALSE (BOLEANO)
		System.out.println();
		System.out.println(variable.contains("VICTOR"));
		System.out.println(variable.contains("EDDIE"));
		System.out.println(variable.contains("ARTURO")); //ARTURO SE IMPRIME COMO FALSE PORQUE FUE ELIMINADO ARRIBA CON .REMOVE
		
		//.SUBLIST IMPRIME LOS ELEMENTOS ENTRE UN SUBÍNDICE Y OTRO, EN ESTE CASO DESDE LA POSICIÓN 0 HASTA LA 2 (0,1 Y 2)
		System.out.println();
		System.out.println(variable.subList(0, 3));
		
		//REGRESA LA LONGITUD DEL ARRAYLIST CON .SIZE, COMO .LENGTH EN ARREGLOS
		System.out.println();
		System.out.println(variable.size());
		System.out.println();
		System.out.println("ESTE ARRAYLIST TIENE " + variable.size() + " ELEMENTOS");
		
		//.CLEAR ELIMINA TODOS LOS ELEMENTOS DEL ARRAYLIST, POR LO TANTO IMPRIME VACÍO
		System.out.println();
		variable.clear();
		System.out.println(variable);
		
		//.CONTAINS BUSCA SI EN EL ARRAYLIST EXISTE EL ELEMENTO INDICADO, IMPRIMIÉNDOLO CON UN TRUE O FALSE (BOLEANO)
		//EN ESTE CASO SE IMPRIMEN FALSOS, PORQUE ARRIBA YA FUE ELIMINADO TODO CON .CLEAR
		System.out.println();
		System.out.println(variable.contains("ALFREDO"));
		System.out.println(variable.contains("EDDIE"));
	}
}