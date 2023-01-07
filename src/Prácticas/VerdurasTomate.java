package Pr�cticas;

public class VerdurasTomate extends Verduras {
	private String color; //COLOR DEL TOMATE
	private double proteinas; //EN GRAMOS
	
	public VerdurasTomate() {
		//CONSTRUCTOR VAC�O
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
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. C�DIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. CALOR�AS: " + getCalorias() + " GR. COLOR: " + getColor() + ". PROTE�NAS: " + getProteinas() + " GR");
		return respuesta;
	}
}