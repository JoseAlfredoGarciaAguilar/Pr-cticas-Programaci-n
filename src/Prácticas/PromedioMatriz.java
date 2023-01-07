package Prácticas;

import java.util.Scanner;

//CALCULA EL PROMEDIO DE TODOS LOS ELEMENTOS DE UNA MATRIZ
public class PromedioMatriz {

	public static void main(String[] args) {
		int fil, col;
		Scanner entrada = new Scanner(System.in);
		// VALIDA QUE NO SE INGRESEN 0 FILAS
		do {
			System.out.print("NÚMERO DE FILAS: ");
			fil = entrada.nextInt();
			if (fil == 0) {
				System.out.println("INVÁLIDO...");
			}
		} while (fil == 0);
		// VALIDA QUE NO SE INGRESEN 0 COLUMNAS
		do {
			System.out.print("NÚMERO DE COLUMNAS: ");
			col = entrada.nextInt();
			if (col == 0) {
				System.out.println("INVÁLIDO...");
			}
		} while (col == 0);

		// CALCULA LA DIMENSIÓN DE LA MATRIZ
		int dimension = fil * col;

		// SE GUARDAN LAS DIMENSIONES
		double[][] matriz = new double[fil][col];

		// SE DECLARAN LOS MÉTODOS
		Captura(matriz, fil, col, entrada);
		Promedio(matriz, fil, col, dimension, entrada);
	}

	// CAPTURA TODOS LOS DATOS DE LA MATRIZ
	public static void Captura(double[][] matriz, int fil, int col, Scanner entrada) {
		System.out.println("-CAPTURA DE DATOS DE LA MATRIZ-");
		for (int a = 0; a < fil; a++) {
			for (int b = 0; b < col; b++) {
				System.out.print("MATRIZ [" + a + "][" + b + "]: ");
				matriz[a][b] = entrada.nextDouble();
			}
		}
	}

	// CALCULA EL PROMEDIO DE TODA LA MATRIZ
	public static void Promedio(double[][] matriz, int fil, int col, int dimension, Scanner entrada) {
		System.out.println();
		double suma = 0;
		// CALCULA LA SUMA EN LA MATRIZ
		for (int c = 0; c < fil; c++) {
			for (int d = 0; d < col; d++) {
				suma += matriz[c][d];
			}
		}
		// CALCULA EL PROMEDIO (SUMA/DIMENSIÓN)
		double promedio = suma / dimension;
		System.out.println("PROMEDIO DE TODA LA MATRIZ: " + promedio);
	}
}