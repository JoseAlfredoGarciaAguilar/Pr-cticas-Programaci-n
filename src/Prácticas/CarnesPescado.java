package Pr�cticas;

public class CarnesPescado extends Carnes {
	private double grasa; //EN GRAMOS
	private double colesterol; //EN GRAMOS
	
	public CarnesPescado(){
		//CONSTRUCTOR VAC�O
	}
	
	public CarnesPescado(String marca, double precio, String codigo, double peso, double grasa, double colesterol){
		super(marca, precio, codigo, peso);
		this.grasa = grasa;
		this.colesterol = colesterol;
	}

	public double getGrasa() {
		return grasa;
	}

	public void setGrasa(double grasa) {
		this.grasa = grasa;
	}

	public double getColesterol() {
		return colesterol;
	}

	public void setColesterol(double colesterol) {
		this.colesterol = colesterol;
	}
	
	public String ToStringPescado(){
		String respuesta = ("MARCA: " + getMarca() + ".   PRECIO POR KG: $" + getPrecio() + ".   C�DIGO DE BARRAS: " + getCodigo() +
				".   PESO: " + getPeso() + " KG.   GRASA: " + getGrasa() + " GR.   COLESTEROL: " + getColesterol() + " GR");
		return respuesta;
	}
}
