package Prácticas;
//IMPRIME LAS TABLAS DE MULTIPLICAR DEL 1 AL 10
public class TablasMult {

	public static void main(String[] args) {
		System.out.println("TABLAS DE MULTIPLICAR DEL 1 AL 10");
		for(int a=1; a<=10; a++) {
			System.out.println();
			System.out.println("TABLA DEL " + a);
			for(int b=1; b<=10; b++) {
				System.out.println(a + "x" + b + "=" + a*b);
			}
		}
	}
}