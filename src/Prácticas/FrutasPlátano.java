package Pr�cticas;

public class FrutasPl�tano extends Frutas {
	private double potasio; //EN GRAMOS
	private double carbohidratos; //EN GRAMOS
	
	public FrutasPl�tano() {
		//CONSTRUCTOR VAC�O
	}
	
	public FrutasPl�tano(String marca, double precio, String codigo, double agua, double fibra, double potasio, double carbohidratos) {
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
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. C�DIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. PORCENTAJE DE FIBRA: " + getFibra() + "%. POTASIO: " + getPotasio() +
				"GR. CARBOHIDRATOS: " + getCarbohidratos() + " GR");
		return respuesta;
	}
}
