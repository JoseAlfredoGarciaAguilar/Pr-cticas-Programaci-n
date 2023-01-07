package Prácticas;
import java.util.ArrayList;

public class ArrayListEjemplo4 {

	public static void main(String[] args) {
		//SE DECLARA EL ARRAYLIST
		ArrayList<String> elementos = new ArrayList<String>();
		
		//SE LLENAN LOS DATOS DEL ARRAYLIST
		elementos.add("JORGE");
		elementos.add("RAMÓN");
		elementos.add("PATRICIA");
		elementos.add("MARTA");
		elementos.add("LUPE");
		elementos.add("OCTAVIO");
		
		//IMPRIME TODOS LOS ELEMENTOS ENTRE CORCHETES
		System.out.println(elementos);
		
		//IMPRIME TODOS LOS ELEMENTOS CON UN BUCLE FOR
		System.out.println();
		for(int x=0; x<elementos.size(); x++) {
			System.out.println(elementos.get(x));
		}
		
		//IMPRIME TODOS LOS ELEMENTOS, MENOS EL ÚLTIMO (GRACIAS AL -1)
		System.out.println();
		for(int j=0; j<elementos.size()-1; j++) {
			System.out.println(elementos.get(j));
		}
		
		//.REMOVE ELIMINA UN ELEMENTO DE UNA POSICIÓN
		System.out.println();
		elementos.remove(3); //MARTA FUE ELIMINADA
		System.out.println(elementos);
		
		//.CONTAINS IMPRIME SI ESE ELEMENTO EXISTE, CON UN TRUE O FALSE
		System.out.println();
		System.out.println(elementos.contains("RAMÓN"));
		System.out.println(elementos.contains("MARTA")); //IMPRIME FALSO PORQUE MARTA YA FUE ELIMINADA
		System.out.println(elementos.contains("LUPE"));
		System.out.println(elementos.contains("PATRICIA"));
		
		//.SUBLIST IMPRIME LOS ELEMENTOS ENTRE UN SUBÍNDICE Y OTRO, EN ESTE CASO DESDE LA POSICIÓN 1 HASTA LA 3
		System.out.println();
		System.out.println(elementos.subList(1, 3));
		
		//.SIZE REGRESA LA LONGITUD DEL ARRAYLIST
		System.out.println();
		System.out.println(elementos.size());
		System.out.println("HAY " + elementos.size() + " ELEMENTOS");
		
		//.CLEAR ELIMINA TODOS LOS ELEMENTOS DEL ARRAYLIST. POR ESO SE IMPRIME VACÍO
		System.out.println();
		elementos.clear();
		System.out.println(elementos);
		
		//IMPRIME QUE HAY 0 ELEMENTOS PORQUE SE BORRARON TODOS CON EL .CLEAR
		System.out.println("HAY " + elementos.size() + " ELEMENTOS");
	}
}