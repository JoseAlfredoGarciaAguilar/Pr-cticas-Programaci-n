package Prácticas;

public class Variables {

	public static void main(String[] args) {
		//UNA VARIABLE ES UN ESPACIO DE MEMORIA DONDE SE ALMACENA UN VALOR
		//VARIABLES PARA DATOS ENTEROS: BYTE, SHORT, INT, LONG
		//VARIABLES PARA DATOS CON DECIMALES: DOUBLE Y FLOAT
		byte entero = 15; //EL BYTE TIENE CAPACIDAD DE -128 A 127
		System.out.println(entero);
		
		short x = 12456;
		System.out.println(x);
		
		int a = 211;
		System.out.println(a);
		
		long e = -85263;
		System.out.println(e);
		
		double y = 11571.3;
		System.out.println(y);
		
		float w = 163.1f; //PARA MOSTRAR FLOAT, SIEMPRE SE COLOCA UNA F LUEGO DEL NÚMERO
		System.out.println(w);
		//FLOAT OCUPA 32 BITS EN MEMORIA, Y DOUBLE 64. CONVIENE USAR FLOAT
		
		char caracter = 'a';
		System.out.println(caracter);
		
		String palabra = "probando";
		System.out.println(palabra);
		
		boolean bandera = true;
		System.out.println(bandera);
	}
}