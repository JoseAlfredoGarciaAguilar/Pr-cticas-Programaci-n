package Prácticas;
import java.text.DecimalFormat;
import java.util.Scanner;
//PIDE LAS DIMENSIONES DE UNA MATRIZ Y LLENA LAS POSICIONES CON NÚMEROS RANDOM ENTRE 0 Y 100. LUEGO LOS MUESTRA
public class MatrizRandom {

	public static void main(String[] args) {
		int fil, col;
		double suma_total = 0, promedio=0;
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

		int[][] matriz = new int[fil][col];

		DatosRandom(matriz, fil, col);
		Mostrar(matriz, fil, col, entrada, suma_total, promedio);
	}

	public static void DatosRandom(int[][] matriz, int fil, int col) {
		// SE LLENA CADA POSICIÓN DE LA MATRIZ CON NÚMEROS ALEATORIOS ENTRE 0 Y 100
		for (int a = 0; a < fil; a++) {
			for (int b = 0; b < col; b++) {
				matriz[a][b] = (int) (Math.random() * 100);
			}
		}
	}

	public static void Mostrar(int[][] matriz, int fil, int col, Scanner entrada, double suma_total, double promedio) {
		// SE CALCULA EL TOTAL DE ELEMENTOS DE TODA LA MATRIZ
		DecimalFormat df = new DecimalFormat("#.000");
		int dim = fil * col; //acumulador=0;
		//int contador_intentos=1;
		//double[] arreglo = new double[contador_intentos];
		//int promedio_final;
		String r;
		System.out.println();
		// SE MUESTRA TODA LA MATRIZ LLENA
		System.out.println("-MUESTRA DE " + dim + " DATOS RANDOM-");
		for (int c = 0; c < fil; c++) {
			for (int d = 0; d < col; d++) {
				suma_total += matriz[c][d];
				System.out.print(matriz[c][d] + "  ");
			}
			System.out.println();
		}
		promedio = suma_total / dim;
		System.out.println();
		System.out.println("SUMA DE TODOS LOS NÚMEROS = " + suma_total);
		System.out.println();
		System.out.println("PROMEDIO DE TODOS LOS NÚMEROS (" + suma_total + "/" + dim + ") = " + df.format(promedio));

		// SE VALIDA QUE SE INGRESE UNA RESPUESTA SI O NO
		do {
			System.out.println();
			// SE DA LA OPCIÓN DE VOLVER A EJECUTAR EL PROGRAMA
			System.out.print("¿QUIERES HACERLO DE NUEVO?  ¿SÍ O NO?: ");
			r = entrada.next();
			// EN CASO DE SI, SE VUELVE A HACER TODA LA ACCIÓN (PARA CADA CASO SERÁN
			// DIFERENTES NÚMEROS RANDOM)
			if (r.equals("SI") || r.equals("si")) {
				//contador_intentos++;
				DatosRandom(matriz, fil, col);
				Mostrar(matriz, fil, col, entrada, suma_total, promedio);
				/*
				for(int x=0; x<arreglo.length; x++) {
					arreglo[x] = promedio;
					acumulador += arreglo[x];
				}
				System.out.println("ACUMULADOR " + acumulador);
				promedio_final = acumulador / contador_intentos;
				System.out.println("PROMEDIO FINAL DE TODOS LOS INTENTOS = " + promedio_final);
				*/
			}
			// EN CASO DE NO, SE ACABA
			else if (r.equals("NO") || r.equals("no")) {
				System.out.println();
				System.out.println("FIN");
			} else if (!r.equals("SI") && !r.equals("si") && !r.equals("NO") && !r.equals("no")) {
				System.out.println("INVÁLIDO...");
			}
		} while (!r.equals("SI") && !r.equals("si") && !r.equals("NO") && !r.equals("no"));
	}
}