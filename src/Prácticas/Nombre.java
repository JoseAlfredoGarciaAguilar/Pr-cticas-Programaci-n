package Prácticas;
//SE PIDE UN NOMBRE Y SE IMPRIME CON UN BUENOS DÍAS
public class Nombre {

	public static void main(String[] args) {
		System.out.print("NOMBRE: ");
		String name = Leer.dato();
		
		System.out.println("BUENOS DÍAS " + name);
	}
}