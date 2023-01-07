package Prácticas;

public class VehiculoPolim {
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	public VehiculoPolim() {
		//CONSTRUCTOR VACÍO
	}
	
	public VehiculoPolim(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//SIRVE COMO TOSTRING
	public String MostrarDatos() {
		return "MATRÍCULA: "+matricula+".   MARCA: "+marca+".   MODELO: "+modelo;
	}
}