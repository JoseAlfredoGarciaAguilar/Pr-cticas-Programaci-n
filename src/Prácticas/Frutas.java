package Prácticas;

public class Frutas extends Supermercado {
	private double agua; //PORCENTAJE DE AGUA
	private double fibra; //PORCENTAJE DE FIBRA
	
	public Frutas() {
		//CONSTRUCTOR VACÍO
	}
	
	public Frutas(String marca, double precio, String codigo, double agua, double fibra) {
		super(marca, precio, codigo);
		this.agua = agua;
		this.fibra = fibra;
	}

	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public double getFibra() {
		return fibra;
	}

	public void setFibra(double fibra) {
		this.fibra = fibra;
	}
}