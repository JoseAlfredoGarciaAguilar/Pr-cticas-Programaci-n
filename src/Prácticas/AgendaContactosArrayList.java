package Prácticas;

import java.util.ArrayList;

public class AgendaContactosArrayList {

	public static void main(String[] args) {
		ArrayList<String> arreglo = new ArrayList<String>();
		char elecc;
		
		do {
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("AGREGAR");
			System.out.println("MODIFICAR");
			System.out.println("BUSCAR");
			System.out.println("ELIMINAR");
			elecc = Leer.datocar();
			if(elecc!='a'&&elecc!='A'&&elecc!='m'&&elecc!='M'&&elecc!='b'&&elecc!='B'&&elecc!='e'&&elecc!='E') {
				System.out.println("INVÁLIDO...");
			}
		}while(elecc!='a'&&elecc!='A'&&elecc!='m'&&elecc!='M'&&elecc!='b'&&elecc!='B'&&elecc!='e'&&elecc!='E');
		
		switch(elecc) {
		case 'a':
			Agregar(arreglo);
		case 'A':
			Agregar(arreglo);
			/*
		case 'm':
			Modificar();
		case 'M':
			Modificar();
		case 'b':
			Buscar();
		case 'B':
			Buscar();
		case 'e':
			Eliminar();
		case 'E':
			Eliminar();
		}
		*/
		}
	}
	
	public static void Agregar(ArrayList arreglo) {
		System.out.print("NOMBRE DEL NUEVO CONTACTO");
		String nom = Leer.dato();
		arreglo.add(nom);
		System.out.println(nom + " HA SIDO AGREGADO");
	}
}