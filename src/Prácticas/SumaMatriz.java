package Prácticas;
import java.util.Scanner;
//PIDE LOS NÚMEROS DE UNA MATRIZ DE N X N, Y MUESTRA LA SUMA DE LAS FILAS Y DE LAS COLUMNAS POR SEPARADO
public class SumaMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filas, columnas;
		// SE PIDEN LAS DIMENSIONES
		// SE VALIDA QUE NO SE INGRESE 0 PARA LAS FILAS
		do {
			System.out.print("NÚMERO DE FILAS: ");
			filas = entrada.nextInt();
			if (filas == 0) {
				System.out.println("INVÁLIDO...");
			}
		} while (filas == 0);
		// SE VALIDA QUE NO SE INGRESE 0 PARA LAS COLUMNAS
		do {
			System.out.print("NÚMERO DE COLUMNAS: ");
			columnas = entrada.nextInt();
			if (columnas == 0) {
				System.out.println("INVÁLIDO...");
			}
		} while (columnas == 0);

		// SE CREA LA MATRIZ CON LAS DIMENSIONES YA DADAS
		int[][] matriz = new int[filas][columnas];

		System.out.println("CAPTURA DE DATOS");
		// SE PIDEN LOS DATOS
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("MATRIZ [" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		// SE MUESTRA LA MATRIZ LLENA
		System.out.println();
		System.out.println("MATRIZ LLENA");
		for (int p = 0; p < filas; p++) {
			for (int q = 0; q < columnas; q++) {
				System.out.print(matriz[p][q] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("SUMA DE LAS FILAS");
		int suma_filas;
		// SE SUMAN LAS FILAS
		for (int x = 0; x < filas; x++) {
			suma_filas = 0;
			for (int y = 0; y < columnas; y++) {
				// SE ACUMULA EL TOTAL DE LAS FILAS
				suma_filas += matriz[x][y];
			}
			System.out.println("SUMA DE LA FILA " + (x + 1) + ": " + suma_filas);
		}

		System.out.println();
		System.out.println("SUMA DE LAS COLUMNAS");
		int suma_columnas;
		// SE SUMAN LAS COLUMNAS
		for (int m = 0; m < columnas; m++) {
			suma_columnas = 0;
			for (int n = 0; n < filas; n++) {
				// SE ACUMULA EL TOTAL DE LAS COLUMNAS
				suma_columnas += matriz[n][m];
			}
			System.out.println("SUMA DE LA COLUMNA " + (m + 1) + ": " + suma_columnas);
		}
	}
}