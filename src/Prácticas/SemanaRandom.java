package Prácticas;
//GENERA UN DÍA RANDOM Y LO IMPRIME
public class SemanaRandom {

	public static void main(String[] args) {
		String[] dias = {"LUNES","MARTES","MIÉRCOLES","JUEVES","VIERNES","SÁBADO","DOMINGO"};
		int x = (int) (Math.random()*7);
		System.out.println(dias[x]);
	}
}