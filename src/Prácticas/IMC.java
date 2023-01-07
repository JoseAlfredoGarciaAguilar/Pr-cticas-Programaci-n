package Prácticas;

public class IMC {
	private String nombre;
	private double peso;
	private double estatura;
	
	public IMC() {
		//CONSTRUCTOR VACÍO
	}
	
	public IMC(String nombre, double peso, double estatura) {
		super();
		this.nombre=nombre;
		this.peso=peso;
		this.estatura=estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getEstatura() {
		return estatura;
	}
	
	public void GeneraIMC() {
		double estatura_cuadrado = Math.pow(estatura, 2);
		double imc = peso / estatura_cuadrado;
		System.out.println("IMC DE " + nombre + ": " + imc);
	}
	
	public void Salud() {
		double estatura_cuadrado = Math.pow(estatura, 2);
		double imc = peso / estatura_cuadrado;
		if(imc<18.5) {
			System.out.println(nombre + " - PESO BAJO");
		}
		else if(imc>=18.5&&imc<=24.9) {
			System.out.println(nombre + " - PESO NORMAL");
		}
		else if(imc>=25&&imc<=29.9) {
			System.out.println(nombre + " - SOBREPESO");
		}
		else if(imc>=30) {
			System.out.println(nombre + " - OBESIDAD");
		}
	}
}