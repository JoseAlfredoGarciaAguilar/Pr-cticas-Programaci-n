package Pr�cticas;

public class Peso {
	private String nombre;
	private double peso;
	
	public Peso() {
		//CONSTRUCTOR VAC�O
	}
	
	public Peso(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}