package Pr�cticas;

public class Carro extends Veh�culo {
	private int puertas; //N�MERO DE PUERTAS
	private int transmisi�n; //AUTOM�TIDA O EST�NDAR
	
	public Carro() {
		//CONSTRUCTOR VAC�O
	}
	
	public Carro(int marca, int color, double cilindraje, int puertas, int transmisi�n) {
		super(marca, color, cilindraje);
		this.puertas = puertas;
		this.transmisi�n = transmisi�n;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getTransmisi�n() {
		return transmisi�n;
	}

	public void setTransmisi�n(int transmisi�n) {
		this.transmisi�n = transmisi�n;
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
		
		switch(transmisi�n) {
		case 1:
			salida_trans = "AUTOM�TICA";
		case 2:
			salida_trans = "EST�NDAR";
		}
		
		return "MARCA: " + salida_marca + ". COLOR: " + salida_color + ". CILINDRAJE: " + getCilindraje() + " CILINDROS. PUERTAS: " + getPuertas() + ". TRANSMISI�N: " + salida_trans;
	}
}