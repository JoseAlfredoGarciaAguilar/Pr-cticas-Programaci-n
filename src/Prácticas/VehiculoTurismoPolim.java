package Pr�cticas;

public class VehiculoTurismoPolim extends VehiculoPolim {
	private int puertas; //N�MERO DE PUERTAS
	
	public VehiculoTurismoPolim() {
		//CONSTRUCTOR VAC�O
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
		return "MATR�CULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo+".   N�MERO DE PUERTAS: "+puertas;
	}
}