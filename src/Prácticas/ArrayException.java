package Prácticas;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int[] array = new int[4];
			array[0] = 7;
			array[1] = 4;
			array[2] = 9;
			array[3] = 21;
			System.out.println(array[-7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR EN EL ARREGLO...");
		}finally {
			System.out.println("FIN");
		}
	}
}