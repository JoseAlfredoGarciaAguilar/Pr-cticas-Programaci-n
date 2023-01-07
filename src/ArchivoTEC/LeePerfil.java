package ArchivoTEC;

import java.io.*;

public class LeePerfil {

	public static void Mostrar(String nombre_fichero, Maestro[] maestro) throws IOException {
		ObjectInputStream o = null;
		File fichero = null;

		try {
			System.out.println();
			System.out.println("-MOSTRAR TODOS LOS DATOS-");
			fichero = new File(nombre_fichero);

			if (fichero.exists()) {
				o = new ObjectInputStream(new FileInputStream(fichero));
				Maestro mae;
				String nombre, sexo;
				int a�os_exp, sueldo, x = 0;

				do {
					try {
						mae = (Maestro) o.readObject();
						maestro[x] = mae;
						x++;
						nombre = mae.getNombre();
						sexo = mae.getSexo();
						a�os_exp = mae.getA�os_exp();
						sueldo = mae.getSueldo();

						System.out.println("NOMBRE: " + nombre + ".   SEXO: " + sexo + ".   A�OS DE TRABAJO: "
								+ a�os_exp + ".   SUELDO MENSUAL: $" + sueldo);
					} catch (ArrayIndexOutOfBoundsException e) {

					}
				} while (true);
			} else {
				System.out.println("FICHERO INEXISTENTE");
			}
		} catch (EOFException e) {
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR, " + e.getMessage());
		} finally {
			if (o != null) {
				o.close();
			}
		}
	}

	// MUESTRA HOMBRES Y MUJERES POR SEPARADO
	public static void Sexos(Maestro[] maestro) {
		int hom = 0, muj = 0;
		System.out.println();
		System.out.println("-SEPARADOS POR SEXO-");
		try {
			// CUENTA SOLO LOS HOMBRES
			for (int a = 0; a < maestro.length; a++) {
				if (maestro[a].getSexo().equals("HOMBRE")) {
					hom++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// CUENTA SOLO LAS MUJERES
			for (int b = 0; b < maestro.length; b++) {
				if (maestro[b].getSexo().equals("MUJER")) {
					muj++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LOS HOMBRES
			if (hom == 0) {
				System.out.println("HOMBRES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println("HOMBRES: " + hom);
				for (int c = 0; c < maestro.length; c++) {
					if (maestro[c].getSexo().equals("HOMBRE")) {
						System.out.println(maestro[c].getNombre());
					}
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LAS MUJERES
			if (muj == 0) {
				System.out.println();
				System.out.println("MUJERES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println();
				System.out.println("MUJERES: " + muj);
				for (int d = 0; d < maestro.length; d++) {
					if (maestro[d].getSexo().equals("MUJER")) {
						System.out.println(maestro[d].getNombre());
					}
				}
			}
		} catch (NullPointerException e) {
		}
	}

	// MUESTRA LOS MAESTROS 20 O M�S A�OS DE TRABAJO, SEPARADOS POR SEXO
	public static void A�osTrabajo20(Maestro[] maestro) {
		int hom = 0, muj = 0;
		System.out.println();
		System.out.println("-CON 20 O M�S A�OS DE TRABAJO-");

		try {
			// CUENTA LOS HOMBRES CON M�S DE 20 A�OS DE TRABAJO
			for (int e = 0; e < maestro.length; e++) {
				if (maestro[e].getSexo().equals("HOMBRE") && maestro[e].getA�os_exp() >= 20) {
					hom++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// CUENTA LAS MUJERES CON M�S DE 20 A�OS DE TRABAJO
			for (int f = 0; f < maestro.length; f++) {
				if (maestro[f].getSexo().equals("MUJER") && maestro[f].getA�os_exp() >= 20) {
					muj++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LOS HOMBRES
			if (hom == 0) {
				System.out.println("HOMBRES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println("HOMBRES: " + hom);
				for (int g = 0; g < maestro.length; g++) {
					if (maestro[g].getSexo().equals("HOMBRE") && maestro[g].getA�os_exp() >= 20) {
						System.out.println("NOMBRE: " + maestro[g].getNombre() + ".   A�OS DE TRABAJO: "
								+ maestro[g].getA�os_exp());
					}
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LAS MUJERES
			if (muj == 0) {
				System.out.println();
				System.out.println("MUJERES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println();
				System.out.println("MUJERES: " + muj);
				for (int h = 0; h < maestro.length; h++) {
					if (maestro[h].getSexo().equals("MUJER") && maestro[h].getA�os_exp() >= 20) {
						System.out.println("NOMBRE: " + maestro[h].getNombre() + ".   A�OS DE TRABAJO: "
								+ maestro[h].getA�os_exp());
					}
				}
			}
		} catch (NullPointerException e) {
		}
	}

	// MUESTRA EL MAESTRO DE MENOS A�OS DE TRABAJO, Y EL DE MAYOR
	public static void MenorMayorA�os(Maestro[] maestro) {
		int menor = 0, mayor = 0;
		String nom_menor = "", nom_mayor = "";
		System.out.println();
		System.out.println("-MAESTROS CON MENOS Y M�S A�OS DE TRABAJO-");
		try {
			menor = mayor = maestro[0].getA�os_exp();
			// BUSCA AL MENOR
			for (int i = 0; i < maestro.length; i++) {
				if (maestro[i].getA�os_exp() < menor) {
					menor = maestro[i].getA�os_exp();
					nom_menor = maestro[i].getNombre();
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// BUSCA AL MAYOR
			for (int j = 0; j < maestro.length; j++) {
				if (maestro[j].getA�os_exp() > mayor) {
					mayor = maestro[j].getA�os_exp();
					nom_mayor = maestro[j].getNombre();
				}
			}
		} catch (NullPointerException e) {
		}

		// MUESTRA LOS DATOS
		System.out.println("MENOS A�OS:   NOMBRE: " + nom_menor + ".   A�OS DE TRABAJO: " + menor);
		System.out.println("M�S A�OS:   NOMBRE: " + nom_mayor + ".   A�OS DE TRABAJO: " + mayor);
	}

	// MUESTRA LOS EMPLEADOS QUE GANAN $20,000 O M�S MENSUALES, SEPARADOS POR SEXO
	public static void Sueldo20(Maestro[] maestro) {
		int hom = 0, muj = 0;
		System.out.println();
		System.out.println("-CON SUELDO DE $20,000 O M�S MENSUALES-");
		try {
			// CUENTA LOS HOMBRES QUE GANAN M�S DE $20,000
			for (int k = 0; k < maestro.length; k++) {
				if (maestro[k].getSexo().equals("HOMBRE") && maestro[k].getSueldo() >= 20000) {
					hom++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// CUENTA LAS MUJERES QUE GANAN M�S DE $20,000
			for (int l = 0; l < maestro.length; l++) {
				if (maestro[l].getSexo().equals("MUJER") && maestro[l].getSueldo() >= 20000) {
					muj++;
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LOS HOMBRES
			if (hom == 0) {
				System.out.println("HOMBRES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println("HOMBRES: " + hom);
				for (int m = 0; m < maestro.length; m++) {
					if (maestro[m].getSexo().equals("HOMBRE") && maestro[m].getSueldo() >= 20000) {
						System.out.println(
								"NOMBRE: " + maestro[m].getNombre() + ".   SUELDO MENSUAL: $" + maestro[m].getSueldo());
					}
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// MUESTRA SOLO LAS MUJERES
			if (muj == 0) {
				System.out.println();
				System.out.println("MUJERES: 0");
				System.out.println("NO HAY");
			} else {
				System.out.println();
				System.out.println("MUJERES: " + muj);
				for (int n = 0; n < maestro.length; n++) {
					if (maestro[n].getSexo().equals("MUJER") && maestro[n].getSueldo() >= 20000) {
						System.out.println(
								"NOMBRE: " + maestro[n].getNombre() + ".   SUELDO MENSUAL: $" + maestro[n].getSueldo());
					}
				}
			}
		} catch (NullPointerException e) {
		}
	}

	public static void MenorMayorSueldo(Maestro[] maestro) {
		int menor = 0, mayor = 0;
		String nom_menor = "", nom_mayor = "";
		System.out.println();
		System.out.println("-MAESTROS CON MENOR Y MAYOR SUELDO MENSUAL");
		try {
			menor = maestro[0].getSueldo();
			// BUSCA AL MENOR
			for (int � = 0; � < maestro.length; �++) {
				if (maestro[�].getSueldo() < menor) {
					menor = maestro[�].getSueldo();
					nom_menor = maestro[�].getNombre();
				}
			}
		} catch (NullPointerException e) {
		}

		try {
			// BUSCA AL MAYOR
			for (int o = 0; o < maestro.length; o++) {
				if (maestro[o].getSueldo() > mayor) {
					mayor = maestro[o].getSueldo();
					nom_mayor = maestro[o].getNombre();
				}
			}
		} catch (NullPointerException e) {
		}

		// MUESTRA LOS DATOS
		System.out.println("SUELDO MENOR:   NOMBRE: " + nom_menor + ".   SUELDO MENSUAL: $" + menor);
		System.out.println("SUELDO MAYOR:   NOMBRE: " + nom_mayor + ".   SUELDO MENSUAL: $" + mayor);
	}

	// MUESTRA LA SUMA DE TODOS LOS SUELDOS MENSUALES
	public static void SueldoAcumulado(Maestro[] maestro) {
		int suma = 0;
		System.out.println();
		System.out.println("-SUELDOS ACUMULADOS-");
		try {
			// ACUMULA LA SUMA
			for (int p = 0; p < maestro.length; p++) {
				suma += maestro[p].getSueldo();
			}
		} catch (NullPointerException e) {
		}

		// MUESTRA EL RESULTADO
		System.out.println("SUELDO ACUMULADO DE TODOS LOS MAESTROS: $" + suma);
	}

	public static void main(String[] args) {
		String nombre_fichero = null;
		File fichero = null;

		try {
			System.out.print("NOMBRE DEL FICHERO A LEER: ");
			nombre_fichero = LeerArch.dato();
			Maestro[] maestro = new Maestro[20];
			Mostrar(nombre_fichero, maestro);
			Sexos(maestro);
			A�osTrabajo20(maestro);
			MenorMayorA�os(maestro);
			Sueldo20(maestro);
			MenorMayorSueldo(maestro);
			SueldoAcumulado(maestro);
		} catch (IOException e) {
			System.out.println("ERROR, " + e.getMessage());
		}
	}
}