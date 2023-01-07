package Prácticas;

public class Cd extends Mixup {
	//DATOS DEL CD
	private String artista; //NOMBRE DEL ARTISTA
	private int canciones; //NÚMERO DE CANCIONES DEL CD
	
	public Cd() {
		//CONSTRUCTOR VACÍO
	}
	
	public Cd(int piezas, double precio, String artista, int canciones) {
		super(piezas, precio);
		this.artista = artista;
		this.canciones = canciones;
	}

	public String getArtista() {
		return artista;
	}

	public int getCanciones() {
		return canciones;
	}
	
	public String toString() {
		return "NÚMERO DE PIEZAS: "+piezas+".   PRECIO POR PIEZA: $"+precio+".   ARTISTA: "+artista+".   NÚMERO DE CANCIONES: "+canciones;
	}
}