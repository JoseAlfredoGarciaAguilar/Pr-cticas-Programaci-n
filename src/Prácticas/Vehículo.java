package Prácticas;

public class Vehículo {
	protected int marca;
	protected int color;
	protected double cilindraje;
	
	public Vehículo() {
		//COSTRUCTOR VACÍO
	}
	
	public Vehículo(int marca, int color, double cilindraje) {
		super();
		this.marca = marca;
		this.color = color;
		this.cilindraje = cilindraje;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
}