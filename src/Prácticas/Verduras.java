package Prácticas;

public class Verduras extends Supermercado {
	private double agua; //PORCENTAJE DE AGUA
	private double calorias; //EN GRAMOS
	
	public Verduras() {
		//CONSTRUCTOR VACÍO
	}
	
	public Verduras(String marca, double precio, String codigo, double agua, double calorias) {
		super(marca, precio, codigo);
		this.agua = agua;
		this.calorias = calorias;
	}

	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
}