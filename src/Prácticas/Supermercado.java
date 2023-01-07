package Prácticas;

public class Supermercado {
	private String marca;
	private double precio; //EN PESOS
	private String codigo; //CÓDIGO DE BARRAS
	
	public Supermercado(){
		//CONSTRUCTOR VACÍO
	}
	
	public Supermercado(String marca, double precio, String codigo){
		super();
		this.marca = marca;
		this.precio = precio;
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}