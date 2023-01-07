package Prácticas;

public class Mixup {
	protected int piezas; //NÚMERO DE PIEZAS
	protected double precio; //PRECIO POR PIEZA
	
	public Mixup() {
		
	}
	
	public Mixup(int piezas, double precio) {
		super();
		this.piezas = piezas;
		this.precio = precio;
	}

	public int getPiezas() {
		return piezas;
	}

	public double getPrecio() {
		return precio;
	}
	
	public String toString() {
		return "NÚMERO DE PIEZAS TOTALES: "+piezas+".   PRECIO TOTAL: $"+precio;
	}
}