package ArchivoMIXUP;

public class CD {
	private String genero;
	private double precio;
	private int piezas_vendidas;
	private double venta_total;
	
	public CD() {
		
	}
	
	public CD(String genero, double precio, int piezas_vendidas, double venta_total) {
		this.genero = genero;
		this.precio = precio;
		this.piezas_vendidas = piezas_vendidas;
		this.venta_total = venta_total;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPiezas_vendidas() {
		return piezas_vendidas;
	}

	public void setPiezas_vendidas(int piezas_vendidas) {
		this.piezas_vendidas = piezas_vendidas;
	}

	public double getVenta_total() {
		return venta_total;
	}

	public void setVenta_total(double venta_total) {
		this.venta_total = venta_total;
	}
}