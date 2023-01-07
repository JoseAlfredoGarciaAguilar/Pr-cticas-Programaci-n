package Pr�cticas;
//SE PIDEN LOS DATOS DE UNA MATRIZ Y MUESTRA SI ES O NO ES SIM�TRICA
public class MatrizSimetrica {

	public static void main(String[] args) {
		boolean sim = true;
		System.out.print("N�MERO DE FILAS: ");
		int fil = Leer.datoInt();
		System.out.print("N�MERO DE COLUMNAS: ");
		int col = Leer.datoInt();

		int[][] matriz = new int[fil][col];

		if (fil == col) { // SI EL N�MERO DE FILAS ES IGUAL AL N�MERO DE COLUMNAS
			// SE PIDEN LOS DATOS SOLO SI TIENE EL MISMO N�MERO DE FILAS Y DE COLUMNAS
			System.out.println("-CAPTURA DE DATOS-");
			for (int a = 0; a < fil; a++) {
				for (int b = 0; b < fil; b++) {
					System.out.print("MATRIZ [" + a + "][" + b + "]: ");
					matriz[a][b] = Leer.datoInt();
				}
			}

			// L�GICA QUE COMPRUEBA SI SON SIM�TRICAS O NO
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
				System.out.println("LA MATRIZ S� ES SIM�TRICA");
			} else {
				System.out.println("LA MATRIZ NO ES SIM�TRICA");
			}
		} else {
			System.out.println("LA MATRIZ NO ES SIM�TRICA");
		}
	}
}