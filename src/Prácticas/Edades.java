package Pr�cticas;

public class Edades {
	public String nombre;
	public int edad;
	
	public Edades() {
		//CONSTRUCTOR VAC�O
	}
	
	public Edades(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String ToStringDatos() {
		String salida = getNombre() + ": " + getEdad() + " A�OS";
		return salida;
	}
}