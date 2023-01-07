package Prácticas;
//SUMA DOS NUMEROS ENTEROS
public class Resultado {

	public static void main(String[] args) {
		String nombre = "";
		int var1 = 0;
		int var2 = 0;
		int resultado = 0;
		System.out.println("SUMA DE DOS NÚMEROS ENTEROS");
		
		System.out.print("ESCRIBE TU NOMBRE: ");
		nombre = Leer.dato();
		
		System.out.println();
		System.out.print("DIGITA TU PRIMER NÚMERO: ");
		var1 = Leer.datoInt();
		
		System.out.println();
		System.out.print("DIGITA TU SEGUNDO NÚMERO: ");
		var2 = Leer.datoInt();
		
		resultado = var1 + var2;
		
		System.out.println();
		System.out.println("HOLA " + nombre + ", TU RESULTADO ES " + resultado);
	}
}