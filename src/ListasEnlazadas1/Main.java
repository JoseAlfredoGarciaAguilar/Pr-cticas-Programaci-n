package ListasEnlazadas1;

public class Main {

	public static void main(String[] args) {
		Nodo primer = new Nodo("Ejemplo");
		Nodo segundo = new Nodo(45);
		Nodo tercero = new Nodo("Hola");
		
		primer.enlazarSiguiente(segundo);
		
		primer.obtenerSiguiente().enlazarSiguiente(tercero);
		
		System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString()); //MUESTRA "HOLA"

	}

}
