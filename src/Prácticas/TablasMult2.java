package Pr�cticas;
//PREGUNTA HASTA QU� NUMERO SE QUIEREN LAS TABLAS DE MULTIPLICAR, Y LAS IMPRIME
public class TablasMult2 {

	public static void main(String[] args) {
		System.out.print("�HASTA QU� N�MERO QUIERES LAS TABLAS?: ");
		int N = Leer.datoInt();
		if(N==0) {
			System.out.println("NO SE IMPRIMIR� NINGUNA TABLA");
		}
		if(N!=0) {
			System.out.println("TABLAS DE MULTIPLICAR DEL 1 AL " + N);
			for(int a=1; a<=N; a++) {
				System.out.println();
				System.out.println("TABLA DEL " + a);
				for(int b=0; b<=10; b++) {
					System.out.println(a + "x" + b + "=" + a*b);
				}
			}
		}
	}

}
