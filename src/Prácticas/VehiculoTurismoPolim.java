package Prácticas;

public class VehiculoTurismoPolim extends VehiculoPolim {
	private int puertas; //NÚMERO DE PUERTAS
	
	public VehiculoTurismoPolim() {
		//CONSTRUCTOR VACÍO
	}
	
	public VehiculoTurismoPolim(String matricula, String marca, String modelo, int puertas){
		super(matricula, marca, modelo);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public String MostrarDatos() {
		return "MATRÍCULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo+".   NÚMERO DE PUERTAS: "+puertas;
	}
}