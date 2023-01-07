package Prácticas;

public class FrutasManzana extends Frutas {
	private String color; //COLOR DE LA MANZANA
	private double sodio; //EN MILIGRAMOS
	
	public FrutasManzana() {
		//CONSTRUCTOR VACÍO
	}
	
	public FrutasManzana(String marca, double precio, String codigo, double agua, double fibra, String color, double sodio) {
		super(marca, precio, codigo, agua, fibra);
		this.color = color;
		this.sodio = sodio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getSodio() {
		return sodio;
	}

	public void setSodio(double sodio) {
		this.sodio = sodio;
	}

	public String ToStringManzana() {
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. CÓDIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. PORCENTAJE DE FIBRA: " + getFibra() + "%. SODIO: " + getSodio() + " MG");
		return respuesta;
	}
}