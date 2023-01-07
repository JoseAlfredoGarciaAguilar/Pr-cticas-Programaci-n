package Prácticas;

public class Banco {
	private String nombre;
	private int num_cuenta;
	private double saldo;
	
	public Banco() {
		
	}

	public Banco(String nombre, int num_cuenta, double saldo) {
		super();
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}