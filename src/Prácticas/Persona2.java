package Prácticas;
import java.io.Serializable;

public class Persona2 implements Serializable {
	protected String nombre;
	protected double estatura;
	protected double peso;
	
	public Persona2(){
		super();
	}
	
	public Persona2(String nombre, double estatura, double peso) {
		this.nombre=nombre;
		this.estatura=estatura;
		this.peso=peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void QuienSoy() {
		System.out.println("SOY "+nombre+". MIDO "+estatura+" METROS. PESO "+peso+" KILOS");
	}
}
