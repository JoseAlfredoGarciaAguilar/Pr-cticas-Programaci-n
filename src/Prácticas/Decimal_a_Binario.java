package Prácticas;

import java.util.Scanner;

public class Decimal_a_Binario {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Ingrese el numero decimal a convertir a binario: ");
		int num_decimal = e.nextInt();
        String num_binario = Integer.toBinaryString(Integer.valueOf(num_decimal));
        System.out.println("Resultado binario = " + num_binario);
	}
}