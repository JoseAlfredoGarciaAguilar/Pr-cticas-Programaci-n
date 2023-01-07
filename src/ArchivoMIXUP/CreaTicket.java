package ArchivoMIXUP;

import java.io.*;

import ArchivoTEC.LeerArch;
public class CreaTicket {
	
	public static void Crear(File fichero) throws IOException{
		PrintStream f = System.out;
		ObjectOutputStream o = null;
		String r;
		
		try {
			o = new ObjectOutputStream(new FileOutputStream(fichero));
			String genero;
			double precio, venta_total;
			double piezas_vendidas;
			
			do {
				do {
					System.out.println("GÉNERO   METAL  //  POP  //  BANDA: ");
					genero = LeerArch.dato();
				}while(!genero.equals("METAL")&&!genero.equals("POP")&&!genero.equals("BANDA"));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
