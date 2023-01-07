package Prácticas;

public class Empleado extends Persona {
	private double sueldo;
	private double aguinaldo;
	private int titulo;
	private int experiencia;
	
	public Empleado(String nombre, int edad, double estatura, double peso, double sueldo, double aguinaldo, int titulo, int experiencia) {
		super(nombre, edad, estatura, peso); //SE ESCRIBEN SOLO LOS PARÁMETROS QUE SE HEREDAN DE LA SUPER CLASE
		this.sueldo = sueldo;
		this.aguinaldo = aguinaldo;
		this.titulo = titulo;
		this.experiencia = experiencia;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getAguinaldo() {
		return aguinaldo;
	}

	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	//SE IMPRIMEN LOS DATOS DE LOS EMPLEADOS
	public void ToStringEmpleados() {
		System.out.println("NOMBRE: " + getNombre() + ". EDAD: " + getEdad() + ". ESTATURA: " + getEstatura() + ". PESO: " + getPeso() + ". SUELDO: " + sueldo + ". AGUINALDO: " + aguinaldo + ". TÍTULO: " + titulo + ". EXPERIENCIA: " + experiencia);
	}
}