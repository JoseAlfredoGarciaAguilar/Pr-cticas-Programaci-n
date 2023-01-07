package Prácticas;

public class VehiculoDeportivoPolim extends VehiculoPolim {
	private int cilindraje;
	
	public VehiculoDeportivoPolim() {
		//CONSTRUCTOR VACÍO
	}
	
	public VehiculoDeportivoPolim(String matricula, String marca, String modelo, int cilindraje) {
		super(matricula, marca, modelo);
		this.cilindraje = cilindraje;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	public String MostrarDatos() {
		return "MATRÍCULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo+".   CILINDRAJE: "+cilindraje;
	}
}