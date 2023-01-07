package Prácticas;
//SE PIDEN LOS DATOS DE UNA MATRIZ Y MUESTRA SI ES O NO ES SIMÉTRICA
public class MatrizSimetrica {

	public static void main(String[] args) {
		boolean sim = true;
		System.out.print("NÚMERO DE FILAS: ");
		int fil = Leer.datoInt();
		System.out.print("NÚMERO DE COLUMNAS: ");
		int col = Leer.datoInt();

		int[][] matriz = new int[fil][col];

		if (fil == col) { // SI EL NÚMERO DE FILAS ES IGUAL AL NÚMERO DE COLUMNAS
			// SE PIDEN LOS DATOS SOLO SI TIENE EL MISMO NÚMERO DE FILAS Y DE COLUMNAS
			System.out.println("-CAPTURA DE DATOS-");
			for (int a = 0; a < fil; a++) {
				for (int b = 0; b < fil; b++) {
					System.out.print("MATRIZ [" + a + "][" + b + "]: ");
					matriz[a][b] = Leer.datoInt();
				}
			}

			// LÓGICA QUE COMPRUEBA SI SON SIMÉTRICAS O NO
			int i = 0, j;
			while (i < fil && sim == true) {
				j = 0;
				while (j < i && sim == true) {
					if (matriz[i][j] != matriz[j][i]) {
						sim = false;
					}
					j++;
				}
				i++;
			}

			if (sim == true) {
				System.out.println("LA MATRIZ SÍ ES SIMÉTRICA");
			} else {
				System.out.println("LA MATRIZ NO ES SIMÉTRICA");
			}
		} else {
			System.out.println("LA MATRIZ NO ES SIMÉTRICA");
		}
	}
}