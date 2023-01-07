package Escuela;

public class Maestro extends TEC {
	private String materia;
	private double sueldo;
	
	public Maestro() {
		
	}
	
	public Maestro(String nombre, int edad, String materia, double sueldo) {
		super(nombre, edad);
		this.materia = materia;
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return "NOMBRE: "+nombre+"   . EDAD: "+edad+"   . MATERIA: "+materia+"   . SUELDO: $"+sueldo;
	}
}