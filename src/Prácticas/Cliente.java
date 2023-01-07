package Prácticas;

public class Cliente {
	private String nombre;
	private double saldo;
	private double retirar;
	private double nuevo_saldo;
	
	public Cliente() {
		
	}

	public Cliente(String nombre, double saldo, double retirar, double nuevo_saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.retirar = retirar;
		this.nuevo_saldo = nuevo_saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getRetirar() {
		return retirar;
	}

	public void setRetirar(double retirar) {
		this.retirar = retirar;
	}

	public double getNuevo_saldo() {
		return nuevo_saldo;
	}

	public void setNuevo_saldo(double nuevo_saldo) {
		this.nuevo_saldo = nuevo_saldo;
	}
}