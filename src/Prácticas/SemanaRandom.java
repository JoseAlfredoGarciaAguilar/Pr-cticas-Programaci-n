package Pr�cticas;
//GENERA UN D�A RANDOM Y LO IMPRIME
public class SemanaRandom {

	public static void main(String[] args) {
		String[] dias = {"LUNES","MARTES","MI�RCOLES","JUEVES","VIERNES","S�BADO","DOMINGO"};
		int x = (int) (Math.random()*7);
		System.out.println(dias[x]);
	}
}