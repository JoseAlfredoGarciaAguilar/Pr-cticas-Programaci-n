package Prácticas;

public class Carnes extends Supermercado {
	private double peso; //EN KILOGRAMOS
	
	public Carnes(){
		//CONSTRUCTOR VACÍO
	}
	
	public Carnes(String marca, double precio, String codigo, double peso){
		super(marca, precio, codigo);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}