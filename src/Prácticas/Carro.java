package Prácticas;

public class Carro extends Vehículo {
	private int puertas; //NÚMERO DE PUERTAS
	private int transmisión; //AUTOMÁTIDA O ESTÁNDAR
	
	public Carro() {
		//CONSTRUCTOR VACÍO
	}
	
	public Carro(int marca, int color, double cilindraje, int puertas, int transmisión) {
		super(marca, color, cilindraje);
		this.puertas = puertas;
		this.transmisión = transmisión;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getTransmisión() {
		return transmisión;
	}

	public void setTransmisión(int transmisión) {
		this.transmisión = transmisión;
	}
	
	public String ToStringCarro() {
		String salida_marca="", salida_color="", salida_trans="";
		
		switch(marca) {
		case 1:
			salida_marca = "CHEVROLET";
		case 2:
			salida_marca = "FORD";
		case 3:
			salida_marca = "NISSAN";
		}
		
		switch(color) {
		case 1:
			salida_color = "NEGRO";
		case 2:
			salida_color = "BLANCO";
		case 3:
			salida_color = "GRIS";
		}
		
		switch(transmisión) {
		case 1:
			salida_trans = "AUTOMÁTICA";
		case 2:
			salida_trans = "ESTÁNDAR";
		}
		
		return "MARCA: " + salida_marca + ". COLOR: " + salida_color + ". CILINDRAJE: " + getCilindraje() + " CILINDROS. PUERTAS: " + getPuertas() + ". TRANSMISIÓN: " + salida_trans;
	}
}