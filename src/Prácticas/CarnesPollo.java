package Prácticas;

public class CarnesPollo extends Carnes {
	private double vitaminas; //EN GRAMOS
	private double minerales; //EN GRAMOS
	
	public CarnesPollo(){
		//CONSTRUCTOR VACÍO
	}
	
	public CarnesPollo(String marca, double precio, String codigo, double peso, double vitaminas, double minerales){
		super(marca, precio, codigo, peso);
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}

	public double getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(double vitaminas) {
		this.vitaminas = vitaminas;
	}

	public double getMinerales() {
		return minerales;
	}

	public void setMinerales(double minerales) {
		this.minerales = minerales;
	}
	
	public String ToStingPollo(){
		String respuesta = ("MARCA: " + getMarca() + ". PRECIO: " + getPrecio() + "$. CÓDIGO DE BARRAS: " + getCodigo() +
				". PESO: " + getPeso() + " KG. VITAMINAS: " + getVitaminas() + "GR. MINERALES: " + getMinerales() + " GR");
		return respuesta;
	}
}