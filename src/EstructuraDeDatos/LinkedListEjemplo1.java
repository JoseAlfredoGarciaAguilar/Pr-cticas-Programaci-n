package EstructuraDeDatos;

import java.io.*;
import java.util.LinkedList;

public class LinkedListEjemplo1 {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		
		//SE LLENAN LOS DATOS PARA CADA POSICIÓN
		lista.add("FERNANDA"); //ADD AÑADE UN ELEMENTO A LA LISTA
		lista.add("ALFREDO");
		lista.add("CARLOS");
		lista.add("JOSÉ");
		lista.add("JESÚS");
		lista.add("OSCAR");
		lista.add("CLARA");
		lista.add("MARIANA");
		
		//SE MUESTRA TODA LA LISTA COMPLETA DESDE 0 ENTRE CORCHETES
		System.out.println(lista);
		
		//REMOVEFIRST ELIMINA EL PRIMER ELEMENTO DE LA LISTA
		lista.removeFirst();
		
		//SE MUESTRA NUEVAMENTE TODO PARA VER EL CAMBIO
		System.out.println();
		System.out.println(lista);
		
		//REMOVELAST ELIMINA EL ÚLTIMO ELEMENTO DE LA LISTA
		lista.removeLast();
		
		//SE MUESTRA NUEVAMENTE TODO PARA VER EL CAMBIO
		System.out.println();
		System.out.println(lista);
		
		//REMOVE ELIMINA UN ELEMENTO INDICADO DE LA LISTA, EN ESTE CASO 2 (JOSÉ)
		lista.remove(2);
		
		//SE MUESTRA NUEVAMENTE TODO PARA VER EL CAMBIO
		System.out.println();
		System.out.println(lista);
		
		//GETFIRST EXAMINA EL PRIMER ELEMENTO3
		System.out.println();
		System.out.println(lista.getFirst());
		
		//GETLAST EXAMINA EL ÚLTIMO ELEMENTO
		System.out.println();
		System.out.println(lista.getLast());
		
		//CONTAINS DETERMINA SI EN LA LISTA EXISTE ESE ELEMENTO
		System.out.println();
		System.out.println(lista.contains("ALFREDO")); //MUESTRA TRUE PORQUE ALFREDO SÍ EXISTE
		System.out.println();
		System.out.println(lista.contains("JOSÉ")); //MUESTRA FALSE PORQUE JOSÉ YA FUE ELIMINADO
		
		//ISEMPTY DETERMINA SI LA LISTA ESTÁ O NO ESTÁ VACÍA
		System.out.println();
		System.out.println(lista.isEmpty()); //MUESTRA FALSE PORQUE NO ESTÁ VACÍA, AÚN TIENE ELEMENTOS
		
		//SIZE DETERMINA EL NÚMERO DE ELEMENTOS QUE LE QUEDAN A LA LISTA
		System.out.println();
		System.out.println(lista.size()); //LE QUEDAN 5 ELEMENTOS
		
		//SET COLOCA EL ELEMENTO EN LA POSICIÓN QUE SE ORDENE, CON LO CUAL SE ELIMINA EL ANTERIOR QUE ESTABA EN ESA POSICIÓN
		lista.set(2, "MARIANA");
		
		//SE MUESTRA TODO NUEVAMENTE PARA VER EL CAMBIO
		System.out.println();
		System.out.println(lista);
	}

}
