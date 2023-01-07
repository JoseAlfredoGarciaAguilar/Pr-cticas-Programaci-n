package Prácticas;

public class VerdurasTomate extends Verduras {
	private String color; //COLOR DEL TOMATE
	private double proteinas; //EN GRAMOS
	
	public VerdurasTomate() {
		//CONSTRUCTOR VACÍO
	}
	
	public VerdurasTomate(String marca, double precio, String codigo, double agua, double calorias, String color, double proteinas) {
		super(marca, precio, codigo, agua, calorias);
		this.color = color;
		this.proteinas = proteinas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}
	
	public String ToStringTomate() {
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. CÓDIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. CALORÍAS: " + getCalorias() + " GR. COLOR: " + getColor() + ". PROTEÍNAS: " + getProteinas() + " GR");
		return respuesta;
	}
}