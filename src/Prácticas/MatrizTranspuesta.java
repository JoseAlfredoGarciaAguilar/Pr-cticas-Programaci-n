package Prácticas;
import java.util.Scanner;
//PIDE NÚMEROS PARA UNA MATRIZ, MUESTRA LA ORIGINAL E LUEGO LA IMPRIME TRANSPUESTA
public class MatrizTranspuesta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		//SE PIDEN LOS DATOS DE LA MATRIZ
		System.out.println("CAPTURA DE DATOS");
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				System.out.print("MATRIZ ["+a+"]["+b+"]: ");
				matriz[a][b] = entrada.nextInt();
			}
		}
		
		//SE MUESTRA LA MATRIZ ORIGINAL
		System.out.println();
		System.out.println("MATRIZ ORIGINAL");
		for(int c=0; c<3; c++) {
			for(int d=0; d<3; d++) {
				System.out.print(matriz[c][d]+" ");
			}
			System.out.println(" ");
		}
		
		//SE HACE LA MATRIZ TRANSPUESTA
		int aux=0;
		for(int e=0; e<3; e++) {
			for(int f=0; f<e; f++) {
				aux = matriz[e][f];
				matriz[e][f] = matriz[f][e];
				matriz[f][e] = aux;
			}
		}
		
		//SE MUESTRA LA MATRIZ TRANSPUESTA
		System.out.println();
		System.out.println("MATRIZ TRANSPUESTA");
		for(int g=0; g<3; g++) {
			for(int h=0; h<3; h++) {
				System.out.print(matriz[g][h]+" ");
			}
			System.out.println(" ");
		}
	}

}
