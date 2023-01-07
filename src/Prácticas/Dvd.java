package Prácticas;

public class Dvd extends Mixup {
	//DATOS DEL DVD
	private String genero; //GÉNERO DEL DVD (TERROR, ACCIÓN O SUSPENSO)
	private int duracion; //EN MINUTOS
	
	public Dvd() {
		//CONSTRUCTOR VACÍO
	}
	
	public Dvd(int piezas, double precio, String genero, int duracion) {
		super(piezas, precio);
		this.genero = genero;
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public String toString() {
		return "NÚMERO DE PIEZAS: "+piezas+".   PRECIO POR PIEZA: $"+precio+".   GÉNERO: "+genero+" .   DURACIÓN: "+duracion+" MINUTOS";
	}
}