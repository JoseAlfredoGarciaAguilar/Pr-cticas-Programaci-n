package Prácticas;
import java.util.ArrayList;
//USO BÁSICO DEL ARRAYLIST
public class ArrayListEjemplo {

	public static void main(String[] args) {
		//SE DECLARA EL ARRAYLIST
		ArrayList<String> variable;
		variable = new ArrayList<String>();
		
		//SE LLENAN LOS DATOS PARA CADA POSICIÓN
		variable.add("ALFREDO");
		variable.add("CARLA");
		variable.add("HUGO");
		variable.add("FERNANDA");
		variable.add("HÉCTOR");
		
		//SE RECORRE Y SE IMPRIMEN TODOS LOS ELEMENTOS
		for(int a=0; a<variable.size(); a++) {
			System.out.println(variable.get(a));
		}
		
		
		System.out.println();
		//CON REMOVE, SE ELIMINA UN ELEMENTO DE UNA POSICIÓN
		variable.remove(2);
		//SE IMPRIME NUEVAMENTE PEOR AHORA SIN EL ELEMENTO ELIMINADO
		for(int b=0; b<variable.size(); b++) {
			System.out.println(variable.get(b));
		}
	}
}