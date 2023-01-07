package Prácticas;
//PIDE AL USUARIO LOS NÚMEROS DE UNA MATRIZ Y LUEGO LOS IMPRIME
public class PedirMatriz {

	public static void main(String[] args) {
		//PREGUNTA CUÁNTOS SERÁN
		System.out.print("NÚMERO DE FILAS: "); 
		int filas = Leer.datoInt();
		System.out.print("NÚMERO DE COLUMNAS: ");
		int columnas = Leer.datoInt();
		
		//GUARDA LAS DIMENSIONES DE LA MATRIZ
		int matriz[][] = new int[filas][columnas];
		
		//PIDE LOS NÚMEROS A GUARDAR EN CADA POSICIÓN DE LA MATRIZ
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				System.out.print("MATRIZ [" + i + "][" + j + "]: ");
				matriz[i][j] = Leer.datoInt();
			}
		}
		
		//SE MUESTRAN LOS DATOS GUARDADOS
		System.out.println();
		System.out.println("NÚMEROS GUARDADOS EN LA MATRIZ");
		for(int x=0; x<filas; x++) {
			for(int y=0; y<columnas; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println(" ");
		}
	}
}