package Prácticas;

public class VehiculoFurgonetaPolim extends VehiculoPolim {
	private int carga;
	
	public VehiculoFurgonetaPolim() {
		//CONSTRUCTOR VACÍO
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
		return "MATRÍCULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo+".   CARGA: "+carga+" KG";
	}
}