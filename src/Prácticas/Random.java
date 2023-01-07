package Prácticas;
//GENERA DOS NÚMEROS RANDOM DEL 1 AL 1000 Y LOS MULTIPLICA
public class Random {

	public static void main(String[] args) {
		double a = Math.random()*1000;
		double b = Math.random()*1000;
		System.out.print(a+" x "+b+" = "+a*b);
	}
}