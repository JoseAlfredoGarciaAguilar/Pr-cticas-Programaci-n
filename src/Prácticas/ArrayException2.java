package Prácticas;
//EJEMPLO DE EXCEPTION CON ARRAY
public class ArrayException2 {

	public static void main(String[] args) {
		int[] v = new int[4];
		//SE ASIGNAN VALORES AL VECTOR
		v[0] = 5;
		v[1] = 1;
		v[2] = 9;
		v[3] = 25;
		
		try {
			//NO SE PUEDE IMPRIMIR LA POSICIÓN 7 SI TENEMOS 4
			System.out.println(v[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR EN EL ARREGLO");
		}finally {
			System.out.println("LISTO ALV");
		}
	}
}