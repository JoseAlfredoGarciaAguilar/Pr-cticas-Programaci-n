package Pr�cticas;

import java.util.Scanner;

public class Indigena {
	static Scanner entrada = new Scanner(System.in);

	public static void Pregunta() {
		String resp = "";
		System.out.print("�LA MONCHI ES HUEVONA? (S� O NO): ");
		resp = entrada.next();

		if (resp.equalsIgnoreCase("SI") || resp.equalsIgnoreCase("si")) {
			System.out.println("CORRECTO, LA MONCHI ES LA M�S LACRA Y HUEVONA DE LA COLONIA");
		} else {
			System.out.println("INCORRECTO, LA MONCHI ES UNA HUEVONAZA XD");
			Pregunta();
		}
	}

	public static void main(String[] args) {
		Pregunta();

	}
}