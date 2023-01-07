package Prácticas;

public class VerdurasCebolla extends Verduras {
	private String color; //COLOR DE LA CEBOLLA
	private int capas; //NÚMERO DE CAPAS DE LA CEBOLLA
	
	public VerdurasCebolla() {
		//CONSTRUCTOR VACÍO
	}
	
	public VerdurasCebolla(String marca, double precio, String codigo, double agua, double calorias, String color, int capas) {
		super(marca, precio, codigo, agua, calorias);
		this.color = color;
		this.capas = capas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapas() {
		return capas;
	}

	public void setCapas(int capas) {
		this.capas = capas;
	}
	
	public String ToStringCebolla() {
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. CÓDIGO DE BARRAS: " + getCodigo() +
				". PORCENTAJE DE AGUA: " + getAgua() + "%. CALORÍAS: " + getCalorias() + " GR. COLOR: " + getColor() + ". CAPAS: " + getCapas());
		return respuesta;
	}
}
