package Prácticas;

public class Camión extends Vehículo {
	private int ruta; //NOMBRE DE LA RUTA DEL CAMIÓN
	private int capacidad; //CAPACIDAD DE PASAJEROS DEL CAMIÓN
	
	public Camión(){
		//CONSTRUCTOR VACÍO
	}
	
	public Camión(int marca, int color, double cilindraje, int ruta, int capacidad) {
		super(marca, color, cilindraje);
		this.ruta = ruta;
		this.capacidad = capacidad;
	}

	public int getRuta() {
		return ruta;
	}

	public void setRuta(int ruta) {
		this.ruta = ruta;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public String ToStringCamion() {
		String salida_marca="", salida_color="", salida_ruta="";
		
		switch(marca) {
		case 1:
			salida_marca = "MERCEDES-BENZ";
		case 2:
			salida_marca = "RENAULT TRUCKS";
		case 3:
			salida_marca = "VOLVO";
		}
		
		switch(color) {
		case 1:
			salida_color = "VERDE";
		case 2:
			salida_color = "TINTO";
		case 3:
			salida_color = "BLANCO";
		}
		
		switch(ruta) {
		case 1:
			salida_ruta = "MANDARINA";
		case 2:
			salida_ruta = "BUENOS AIRES";
		case 3:
			salida_ruta = "LOMITA-CAÑADAS";
		case 4:
			salida_ruta = "DIAZ ORDAZ";
		}
		
		return "MARCA: " + salida_marca + ". COLOR: " + salida_color + ". CILINDRAJE: " + getCilindraje() + " CILINDROS. ";
	}
}