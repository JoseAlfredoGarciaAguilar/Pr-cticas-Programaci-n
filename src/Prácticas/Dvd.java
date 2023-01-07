package Pr�cticas;

public class Dvd extends Mixup {
	//DATOS DEL DVD
	private String genero; //G�NERO DEL DVD (TERROR, ACCI�N O SUSPENSO)
	private int duracion; //EN MINUTOS
	
	public Dvd() {
		//CONSTRUCTOR VAC�O
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
		return "N�MERO DE PIEZAS: "+piezas+".   PRECIO POR PIEZA: $"+precio+".   G�NERO: "+genero+" .   DURACI�N: "+duracion+" MINUTOS";
	}
}