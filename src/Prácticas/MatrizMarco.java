package Pr�cticas;
//CREAR UNA MATRIZ "MARCO" DE TAMA�O 5X5: TODOS SUS ELEMENTOS DEBEN SER 0 SALVO LOS DE LOS BORDES DEBEN SER 1. MOSTRARLA
public class MatrizMarco {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		//SE LE DAN VALORES A TODOS LOS ELEMENTOS
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				//SE LES ASIGNA UN 1 A TODOS LOS BORDES. Y A LO QUE NO ES BORDE (LO DEL CENTRO), SE LES ASIGNA UN 0
				//SE LE ASIGNA 1 A LA PRIMERA Y �LTIMA POSICI�N DE LA I
				if(i==0||i==4) {
					matriz[i][j]=1;
				}
				//SE LE ASIGNA 1 A LA PRIMERA Y �LTIMA POSICI�N DE LA J
				else if(j==0||j==4) {
					matriz[i][j]=1;
				//LAS POSICIONES RESTANTES TENDR�N ASIGNADO UN 0
				}else {
					matriz[i][j]=0;
				}
			}
		}
			
		//SE MUESTRA LA MATRIZ COMPLETA
		System.out.println("-MUESTRA-");
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
	}
}