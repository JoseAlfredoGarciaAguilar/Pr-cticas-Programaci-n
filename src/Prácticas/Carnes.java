package Pr�cticas;

public class Carnes extends Supermercado {
	private double peso; //EN KILOGRAMOS
	
	public Carnes(){
		//CONSTRUCTOR VAC�O
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