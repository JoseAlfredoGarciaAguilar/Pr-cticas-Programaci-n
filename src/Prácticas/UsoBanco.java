package Prácticas;

public class UsoBanco {

	public static void main(String[] args) {
		System.out.println("\tBANCOPPEL");
		System.out.print("¿CUÁNTOS CLIENTES TENDRÁ EL BANCO?: ");
		int x = Leer.datoInt();
		
		Banco[] banco = new Banco[x];
		
		Capturar(banco);
		Mostrar(banco);
		Retirar(banco);
	}
	
	public static void Capturar(Banco[] banco) {
		System.out.println("CAPTURA DE CLIENTES");
		for(int a=0; a<banco.length; a++) {
			System.out.print("NOMBRE CLIENTE " + (a+1) + ": ");
			String nombre = Leer.dato();
			System.out.print("NÚMERO DE CUENTA DE " + nombre + ": ");
			int num = Leer.datoInt();
			System.out.print("SALDO DE " + nombre + ": ");
			double saldo = Leer.datoDouble();
			System.out.println();
			banco[a] = new Banco(nombre, num, saldo);
		}
	}
	
	public static void Mostrar(Banco[] banco) {
		System.out.println("LISTA DE CLIENTES");
		for(int b=0; b<banco.length; b++) {
			System.out.println((b+1) + "- NOMBRE: " + banco[b].getNombre() + ". NÚMERO DE CUENTA: " + banco[b].getNum_cuenta() + ". SALDO: $" + banco[b].getSaldo());
		}
	}
	
	public static void Retirar(Banco[] banco) {
		double nuevo_saldo;
		System.out.println();
		System.out.println("RETIRAR SALDO DE UN CLIENTE");
		System.out.print("NÚMERO DE CUENTA DEL CLIENTE A RETIRAR: ");
		int num = Leer.datoInt();
		System.out.print("IMPORTE A RETIRAR: ");
		double imp = Leer.datoDouble();
		for(int c=0; c<banco.length; c++) {
			if(banco[c].getNum_cuenta() == num && banco[c].getSaldo() >= imp) {
				nuevo_saldo = banco[c].getSaldo() - imp;
				System.out.println(banco[c].getNombre() + " RETIRÓ $" + imp);
				System.out.println("EL NUEVO SALDO DE " + banco[c].getNombre() + " ES $" + nuevo_saldo);
			}
			if(banco[c].getNum_cuenta() == num && banco[c].getSaldo() < imp){
				System.out.println("EL SALDO DE " + banco[c].getNombre() + " NO ALCANZA PARA RETIRAR ESA CANTIDAD");
			}
			}
		}
	}