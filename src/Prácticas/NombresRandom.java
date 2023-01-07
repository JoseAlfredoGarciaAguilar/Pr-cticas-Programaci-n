package Prácticas;

import java.util.Scanner;

//GENERA X CANTIDAD DE PERSONAS CON UN NOMBRE, UN APELLIDO, UNA EDAD Y UN ESTADO ALEATORIOS, LOS GUARDA EN UN ARREGLO Y LOS IMPRIME
public class NombresRandom {

	public static void Ejecucion() {
		Scanner e = new Scanner(System.in);
		int cuantas = 0;
		do {
			System.out.print("¿CUANTAS PERSONAS ALEATORIAS DESEAS?: ");
			cuantas = e.nextInt();

			if (cuantas == 0) {
				System.out.println("NO PUEDES INGRESAR 0 PERSONAS...");
			}
			String[] arreglo = new String[cuantas];
			for (int i = 0; i < arreglo.length; i++) {
				int z = 0;
				do {
					String[] nom = { "CARLOS", "RICARDO", "ALFREDO", "DIEGO", "FERNANDA", "SARAHÍ", "LUZ", "PATRICIO",
							"PEDRO", "ANTONIO", "CESAR", "REBECA" };
					String[] ape = { "SÁNCHEZ", "GARCÍA", "BASTIDAS", "ROJAS", "FÉLIX", "ARMENTA", "OLIVAS", "LÓPEZ",
							"MARTINEZ", "RODRÍGUEZ", "ESPARZA", "OZUNA" };
					String[] estado = { "SINALOA", "SONORA", "DURANGO", "CIUDAD DE MÉXICO", "QUINTANA ROO", "JALISCO",
							"NAYARIT", "ESTADO DE MÉXICO", "VERACRUZ", "ZACATECAS", "OAXACA", "YUCATÁN" };
					int w = (int) (Math.random() * 12);
					int x = (int) (Math.random() * 12);
					int y = (int) (Math.random() * 12);
					z = (int) (Math.random() * 100);
					if (z == 1) {
						// System.out.println(nom[x] + " " + ape[y] + " TIENE 1 AÑO");
						arreglo[i] = nom[w] + " " + ape[x] + " ES DEL ESTADO DE " + estado[y] + " Y TIENE 1 AÑO";
					} else if (z > 1) {
						// System.out.println(nom[x] + " " + ape[y] + " TIENE " + z + " AÑOS");
						arreglo[i] = nom[w] + " " + ape[x] + " ES DEL ESTADO DE " + estado[y] + " Y TIENE " + z
								+ " AÑOS";
					}
				} while (z != 0); // Valida que no guarde personas con 0 años, se repite
			}

			// Muestra el arreglo lleno
			for (int j = 0; j < arreglo.length; j++) {
				System.out.println((j + 1) + ": " + arreglo[j]);
			}
		} while (cuantas == 0);

		String resp = "";
		do {
			System.out.println();
			System.out.print("¿DESEAS VOLVERLO A HACER? (SI/NO): ");
			resp = e.next();
			if (resp.equals("SI") || resp.equals("si") || resp.equals("sí") || resp.equals("Si") || resp.equals("SÍ")
					|| resp.equals("Sí")) {
				System.out.println();
				Ejecucion();
			} else if (!resp.equals("SI") && !resp.equals("si") && !resp.equals("NO") && !resp.equals("No")
					&& !resp.equals("no")) {
				System.out.println("RESPUESTA INVÁLIDA, DEBE ELEGIR SI/NO...");
			} else {
				System.out.println("FIN");
			}
		} while (!resp.equals("SI") && !resp.equals("si") && !resp.equals("sí") && !resp.equals("Si")
				&& !resp.equals("SÍ") && !resp.equals("Sí") && !resp.equals("NO") && !resp.equals("No")
				&& !resp.equals("no"));
	}

	public static void main(String[] args) {
		Ejecucion();
	}
}