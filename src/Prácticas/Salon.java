package Prácticas;

import java.util.Scanner;

public class Salon {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("NÚMERO DE ALUMNOS: ");
		int num_alumnos = entrada.nextInt();
		
		int arreglo[] = new int[num_alumnos];
		
		Pedir(arreglo);
	}
	
	public static void Pedir(int[] arreglo) {
		String nombre;
		double calif;
		int num_asist, num_tareas;
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.print("NOMBRE DEL ALUMNO " + (i+1) + ": ");
			nombre = entrada.next();
			System.out.print("CALIFICACIÓN DE " + nombre + ": ");
			calif = entrada.nextDouble();
			
			do {
				System.out.print("NÚMERO DE ASISTENCIAS DE " + nombre + "(0-20): ");
				num_asist = entrada.nextInt();
				if(num_asist<0||num_asist>20) {
					System.out.println("ERROR. INGRESA UN NÚMERO ENTRE 0 Y 20...");
				}
			}while(num_asist<0||num_asist>20);
			
			do {
				System.out.print("NÚMERO DE TAREAS QUE " + nombre + " ENTREGÓ (0-5): ");
				num_tareas = entrada.nextInt();
				if(num_tareas<0||num_tareas>5) {
					System.out.println("ERROR. INGRESA UN NÚMERO ENTRE 0 Y 5...");
				}
			}while(num_tareas<0||num_tareas>5);
			
			arreglo[i] = 
		}
	}

}
