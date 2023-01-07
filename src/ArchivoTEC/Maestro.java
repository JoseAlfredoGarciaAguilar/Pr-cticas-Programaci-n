package ArchivoTEC;

import java.io.Serializable;

public class Maestro implements Serializable {
	private String nombre;
	private String sexo;
	private int a�os_exp; // A�OS DE EXPERIENCIA
	private int sueldo; // SUELDO MENSUAL

	public Maestro() {
		// CONSTRUCTOR VAC�O
	}

	public Maestro(String nombre, String sexo, int a�os_exp, int sueldo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.a�os_exp = a�os_exp;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getA�os_exp() {
		return a�os_exp;
	}

	public void setA�os_exp(int a�os_exp) {
		this.a�os_exp = a�os_exp;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}