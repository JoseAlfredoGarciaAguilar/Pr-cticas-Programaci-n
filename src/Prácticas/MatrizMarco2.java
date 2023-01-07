package Pr�cticas;
import java.util.Scanner;
//CREAR UNA MATRIZ "MARCO" DE TAMA�O 5X5. SE PIDE AL USUARIO EL BORDE Y EL N�MERO INTERIOR
public class MatrizMarco2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("DIMENSI�N PARA CADA LADO: ");
		int d = entrada.nextInt();
		System.out.println("-MATRIZ DE "+d+"x"+d+"-");
		//LA MATRIZ TENDR� LAS MISMAS DIMENSIONES PARA CADA LADO, PARA QUE SEA SIM�TRICA
		int[][] matriz = new int[d][d];
		
		//SE PIDEN LOS N�MEROS PARA DARLE DISE�O
		System.out.print("N�MERO PARA EL BORDE: ");
		int bordes = entrada.nextInt();
		System.out.print("N�MERO PARA EL INTERIOR: ");
		int interior = entrada.nextInt();
		
		//SE LE DAN VALORES A TODOS LOS ELEMENTOS
		for(int i=0; i<d; i++) {
			for(int j=0; j<d; j++) {
				//SE LE ASIGNA EL VALOR AL BORDE
				if(i==0||i==d-1) {
					matriz[i][j]=bordes;
				}
				//SE LE ASIGNA EL VALOR AL BORDE
				else if(j==0||j==d-1) {
					matriz[i][j]=bordes;
				//SE LE ASIGNA EL VALOR AL INTERIOR
				}else {
					matriz[i][j]=interior;
				}
			}
		}
			
		//SE MUESTRA LA MATRIZ COMPLETA
		System.out.println();
		System.out.println("\t-MUESTRA-");
		System.out.println(bordes+" PARA EL BORDE, Y "+interior+" PARA EL INTERIOR");
		System.out.println();
		for(int x=0; x<d; x++) {
			for(int y=0; y<d; y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
	}
}