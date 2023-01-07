package Prácticas;

import java.text.DecimalFormat;
import java.util.Scanner;

//pide una cantidad de numeros random
//muestra el arreglo normal
//muestra el arreglo invertido
//calcula el total de la suma del arreglo
//calcula el promedio de todos
//calcula la raiz cuadrada de la suma
//calcula la suma elevada al cuadrado
public class ArregloRandom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		// TODO Auto-generated method stub
		System.out.print("¿Cuántos numeros random quieres?: ");
		double cuantos = entrada.nextDouble();
		double variable, promedio, arreglo[] = new double[(int) cuantos], suma_total = 0, raiz_cuadrada, cuadrado;
		for (int i = 0; i < arreglo.length; i++) {
			variable = Math.random() * 1000;
			arreglo[i] = variable;
			suma_total += arreglo[i];
		}
		System.out.println("Arreglo normal");
		for (int j = 0; j < arreglo.length; j++) {
			System.out.println(j + 1 + ": " + df.format(arreglo[j]));

		}
		System.out.println("Arreglo invertido");
		for (int k = arreglo.length - 1; k >= 0; k--) {
			System.out.println(k + 1 + ": " + df.format(arreglo[k]));

		}
		System.out.println("Total sumado = " + df.format(suma_total));
		promedio = suma_total / cuantos;
		System.out.println(
				"Promedio de la suma (" + df.format(suma_total) + " / " + cuantos + ") = " + df.format(promedio));
		raiz_cuadrada = Math.sqrt(suma_total);
		System.out.println("Raiz cuadrada de la suma = " + df.format(raiz_cuadrada));
		cuadrado = Math.pow(suma_total, 2);
		System.out.println("Suma elevada al cuadrado = " + df.format(cuadrado));
	}

}
