package Prácticas;
//SE IMPRIMEN LAS TABLAS DE MULTIPLICAR TRIPLES
public class TablaTriple {

	public static void main(String[] args) {
		for(int a=1; a<=10; a++) {
			System.out.println();
			for(int b=1; b<=10; b++) {
				for(int c=1; c<=1; c++) {
					System.out.println(a + "x" + b + "x" + c + "=" + a*b*c);
				}
			}
		}
	}
}