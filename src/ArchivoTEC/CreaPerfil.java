package ArchivoTEC;

import java.io.*;

public class CreaPerfil {

	public static void Crear(File fichero) throws IOException {
		PrintStream f = System.out;
		ObjectOutputStream o = null;
		String r;

		try {
			o = new ObjectOutputStream(new FileOutputStream(fichero));
			String nombre, sexo;
			int años_exp, sueldo;

			do {
				System.out.print("NOMBRE: ");
				nombre = LeerArch.dato();
				// VALIDA QUE SE INGRESE UN SEXO HOMBRE O MUJER
				do {
					System.out.print("SEXO DE " + nombre + "   HOMBRE // MUJER: ");
					sexo = LeerArch.dato();
					if (!sexo.equals("HOMBRE") && !sexo.equals("MUJER")) {
						System.out.println("INVÁLIDO...");
					} else {
						System.out.println(nombre + " ES " + sexo);
					}
				} while (!sexo.equals("HOMBRE") && !sexo.equals("MUJER"));
				// VALIDA QUE SE INGRESE ENTRE 1 Y 50 AÑOS
				do {
					System.out.print("AÑOS DE EMPLEADO DE " + nombre + " (1-50): ");
					años_exp = LeerArch.datoInt();
					if (años_exp < 1 || años_exp > 50) {
						System.out.println("INVÁLIDO...");
					} else {
						System.out.println(nombre + " TIENE " + años_exp + " AÑOS DE EMPLEADO");
					}
				} while (años_exp < 1 || años_exp > 50);
				// VALIDA QUE SE INGRESE UN SUELDO MENSUAL ENTRE $5,000 Y $100,000
				do {
					System.out.print("SUELDO MENSUAL DE " + nombre + " ($5,000-$100,000): ");
					sueldo = LeerArch.datoInt();
					if (sueldo < 5000 || sueldo > 100000) {
						System.out.println("INVÁLIDO...");
					} else {
						System.out.println(nombre + " GANA $" + sueldo + " AL MES");
					}
				} while (sueldo < 5000 || sueldo > 100000);
				System.out.println();

				o.writeObject(new Maestro(nombre, sexo, años_exp, sueldo));
				System.out.print("¿DESEAS AGREGAR UN REGISTRO MÁS?   SI // NO: ");
				r = LeerArch.dato();
			} while (r.equals("si") || r.equals("SI"));
		} finally {
			if (o != null) {
				o.close();
			}
		}
	}

	public static void main(String[] args) {
		PrintStream f = System.out;
		String nombre_fichero = null;
		File fichero = null;

		try {
			System.out.print("NOMBRE DEL NUEVO FICHERO DE DATOS: ");
			nombre_fichero = LeerArch.dato();
			fichero = new File(nombre_fichero);
			String r;

			if (fichero.exists()) {
				do {
					f.print("EL FICHERO YA EXISTE. ¿QUIERES SOBREESCRIBIRLO?   SI // NO: ");
					r = LeerArch.dato();
					LeerArch.limpiar();
					if (r.equals("si") || r.equals("SI")) {
						Crear(fichero);
					}
					if (!r.equals("si") && !r.equals("SI") && !r.equals("no") && !r.equals("NO")) {
						System.out.println("INVÁLIDO...");
					}
				} while (!r.equals("si") && !r.equals("SI") && !r.equals("no") && !r.equals("NO"));
			} else {
				Crear(fichero);
			}
		} catch (IOException e) {
			f.println("ERROR, " + e.getMessage());
		}
	}
}