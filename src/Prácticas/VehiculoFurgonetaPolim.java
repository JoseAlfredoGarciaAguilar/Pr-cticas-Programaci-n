package Pr�cticas;

public class VehiculoFurgonetaPolim extends VehiculoPolim {
	private int carga;
	
	public VehiculoFurgonetaPolim() {
		//CONSTRUCTOR VAC�O
	}
	
	public VehiculoFurgonetaPolim(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public String MostrarDatos() {
		return "MATR�CULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo+".   CARGA: "+carga+" KG";
	}
}