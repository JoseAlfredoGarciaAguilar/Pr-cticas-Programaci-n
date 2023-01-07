package Prácticas;

public class Estudiante extends Persona {
	private double promedio;
	private int semestre;
	private int carrera;
	private int beca;
	
	public Estudiante(String nombre, int edad, double estatura, double peso, double promedio, int semestre, int carrera, int beca) {
		super(nombre, edad, estatura, peso);
		this.promedio = promedio;
		this.semestre = semestre;
		this.carrera = carrera;
		this.beca = beca;
	}
	
	//SE IMPRIMEN LOS DATOS DE LOS ESTUDIANTES
	public void ToStringEstudiantes() {
		System.out.println("NOMBRE: " + getNombre() + ". EDAD: " + getEdad() + ". ESTATURA: " + getEstatura() + ". PESO: " + getPeso() + ". PROMEDIO: " + promedio + ". SEMESTRE: " + semestre + ". CARRERA: " + carrera + ". BECA: " + beca);
	}
}
