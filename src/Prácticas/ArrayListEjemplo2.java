package Prácticas;
import java.util.ArrayList;

public class ArrayListEjemplo2 {

	public static void main(String[] args) {
		//SE CREA EL ARRAYLIST
		ArrayList<String> variable = new ArrayList<String>();
		//SE LLENAN LOS DATOS CON .ADD
		variable.add("VALERIA");
		variable.add("ALFREDO");
		variable.add("MAURICIO");
		variable.add("CARLA");
		variable.add("RIGO");
		
		//SE RECORRE Y SE IMPRIME TODO
		//.SICE INDICA LA LONGITUD DEL ARRAYLIST, COMO .LENGTH EN ARREGLOS
		for(int a=0; a<variable.size(); a++) {
			System.out.println(variable.get(a));
		}
		
		//.REMOVE SIRVE PARA ELIMINAR UN ELEMENTO, INDICANDO SU POSICIÓN
		System.out.println();
		variable.remove(3);
		for(int b=0; b<variable.size(); b++) {
			System.out.println(variable.get(b));
		}
		
		//.GET SIRVE PARA CONSULTAR UN ELEMENTO, INDICANDO SU POSICIÓN
		System.out.println();
		System.out.println(variable.get(1));
		System.out.println(variable.get(2));
		
		//SI SE PONE SOLO EL NOMBRE, SE IMPRIMEN TODOS LOS ELEMENTOS ENTRE CORCHETES
		System.out.println(variable);
	}
}