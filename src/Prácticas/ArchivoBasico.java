package Prácticas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoBasico {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader b = new BufferedReader(new FileReader("c:\\desktop\\pruebaalv.txt"));
		String linea;
		while((linea=b.readLine())!=null) {
			System.out.println(linea);
		}
	}
}