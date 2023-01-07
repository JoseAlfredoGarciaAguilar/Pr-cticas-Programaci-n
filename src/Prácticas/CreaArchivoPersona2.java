package Prácticas;
import java.io.*;

public class CreaArchivoPersona2 {
	
	public static void CrearFichero(File Ficha) throws IOException{
		PrintStream Salida = System.out;
		ObjectOutputStream x = null;
		char respuesta;
		try {
			x = new ObjectOutputStream(new FileOutputStream(Ficha));
			String nombre;
			double estatura, peso, promedio;
			do {
				System.out.print("NOMBRE: ");
				nombre = Leer.dato();
				do {
					System.out.print("ESTATURA DE " + nombre + " EN METROS (1-2.5): ");
					estatura = Leer.datoDouble();
					if(estatura<1||estatura>2.5) {
						System.out.println("ESTATURA INVÁLIDA...");
					}
				}while(estatura<1||estatura>2.5);
				do {
					System.out.print("PESO DE " + nombre + " EN KILOS (40-200): ");
					peso = Leer.datoDouble();
					if(peso<40||peso>200) {
						System.out.println("PESO INVÁLIDO...");
					}
				}while(peso<40||peso>200);
				do {
					System.out.print("PROMEDIO DE " + nombre + " (0-100): ");
					promedio = Leer.datoDouble();
					if(promedio<1||promedio>100) {
						System.out.println("PROMEDIO INVÁLIDO...");
					}
				}while(promedio<1||promedio>100);
				x.writeObject(new Estudiante2(nombre, estatura, peso, promedio));
				do {
					System.out.println("¿DESEAS ESCRIBIR OTRO REGISTRO?: ");
					respuesta = Leer.datocar();
					Leer.limpiar();
					if(respuesta=='s'||respuesta=='S') {
						System.out.println("OPCIÓN INVÁLIDA...");
					}
				}
			}while(respuesta=='s'||respuesta=='S');
		}
		finally {
			if(x!=null) {
				x.close();
			}
		}
	}

	public static void main(String[] args) {
		PrintStream Salida = System.out;
		String Nombre_ficha = null;
		File Ficha = null;
		
		try {
			System.out.print("NOMBRE DEL FICHERO DE DATOS A ESCRIBIR: ");
			Nombre_ficha = Leer.dato();
			Ficha = new File(Nombre_ficha);
			
			char respuesta = 's';
			if(Ficha.exists()) {
				Salida.print("EL FICHERO YA EXISTE. ¿QUIERES SOBREESCRIBIRLO?: ");
				respuesta = Leer.datocar();
				Leer.limpiar();
			}
			if(respuesta=='s') {
				crearFichero(Ficha);
			}
		}
		catch(IOException e) {
			Salida.println();"ERROR. " + e.getMessage()
		}
	}
}