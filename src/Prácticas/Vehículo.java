package Pr�cticas;

public class Veh�culo {
	protected int marca;
	protected int color;
	protected double cilindraje;
	
	public Veh�culo() {
		//COSTRUCTOR VAC�O
	}
	
	public Veh�culo(int marca, int color, double cilindraje) {
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