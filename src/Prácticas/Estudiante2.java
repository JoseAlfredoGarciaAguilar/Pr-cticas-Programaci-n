package Prácticas;
import java.io.Serializable;

public class Estudiante2 extends Persona2 implements Serializable {
	private double promedio;
	
	public Estudiante2() {
		super();
	}
	
	public Estudiante2(String nombre, double estatura, double peso, double promedio) {
		super(nombre, estatura, peso);
		this.promedio=promedio;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}