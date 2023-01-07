package Escuela;

public class Estudiante extends TEC {
	private String carrera;
	private double calif;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, int edad, String carrera, double calif) {
		super(nombre, edad);
		this.carrera = carrera;
		this.calif = calif;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getCalif() {
		return calif;
	}

	public void setCalif(double calif) {
		this.calif = calif;
	}

	public String toString() {
		return "NOMBRE: "+nombre+"   . EDAD: "+edad+"   . CARRERA: "+carrera+"   . CALIFICACIÓN: "+calif;
	}
}