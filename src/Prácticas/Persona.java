package Prácticas;
//SE LE PUEDE LLAMAR CLASE PADRE O SUPER CLASE
public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	private double peso;
	
	public Persona() {
		//CONSTRUCTOR VACÍO
	}

	public Persona(String nombre, int edad, double estatura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
}