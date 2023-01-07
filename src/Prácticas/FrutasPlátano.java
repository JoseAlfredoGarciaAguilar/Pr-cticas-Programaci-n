package Prácticas;

public class FrutasPlátano extends Frutas {
	private double potasio; //EN GRAMOS
	private double carbohidratos; //EN GRAMOS
	
	public FrutasPlátano() {
		//CONSTRUCTOR VACÍO
	}
	
	public FrutasPlátano(String marca, double precio, String codigo, double agua, double fibra, double potasio, double carbohidratos) {
		super(marca, precio, codigo, agua, fibra);
		this.potasio = potasio;
		this.carbohidratos = carbohidratos;
	}

	public double getPotasio() {
		return potasio;
	}

	public void setPotasio(double potasio) {
		this.potasio = potasio;
	}

	public double getCarbohidratos() {
		return carbohidratos;
	}

	public void setCarbohidratos(double carbohidratos) {
		this.carbohidratos = carbohidratos;
	}
	
	public String ToStringPlatano() {
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. CÓDIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. PORCENTAJE DE FIBRA: " + getFibra() + "%. POTASIO: " + getPotasio() +
				"GR. CARBOHIDRATOS: " + getCarbohidratos() + " GR");
		return respuesta;
	}
}
