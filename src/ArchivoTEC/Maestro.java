package ArchivoTEC;

import java.io.Serializable;

public class Maestro implements Serializable {
	private String nombre;
	private String sexo;
	private int años_exp; // AÑOS DE EXPERIENCIA
	private int sueldo; // SUELDO MENSUAL

	public Maestro() {
		// CONSTRUCTOR VACÍO
	}

	public Maestro(String nombre, String sexo, int años_exp, int sueldo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.años_exp = años_exp;
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

	public int getAños_exp() {
		return años_exp;
	}

	public void setAños_exp(int años_exp) {
		this.años_exp = años_exp;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}