package Prácticas;
//FORMA BÁSICA DE CREAR UN OBJETO Y LLENAR SUS ATRIBUTOS MANUALMENTE
public class Automovil {
	//SE CREAN LOS PARÁMETROS 
	String marca;
	String color;
	double km;

	public static void main(String[] args) {
		//SE CREAN LOS 2 OBJETOS
		Automovil coche1 = new Automovil();
		Automovil coche2 = new Automovil();
		
		//SE LLENAN LOS DATOS DE SUS PARÁMETROS
		coche1.marca = "MINI COOPER";
		coche1.color = "AZUL";
		coche1.km = 250.9;
		
		coche2.marca = "CHEVROLET";
		coche2.color = "VERDE";
		coche2.km = 187.2;
		
		//SE MUESTRAN LOS DATOS
		System.out.println("COCHE 1");
		System.out.println("MARCA: "+coche1.marca);
		System.out.println("COLOR: "+coche1.color);
		System.out.println("KILOMETRAJE: "+coche1.km+" KM");
		
		System.out.println();
		System.out.println("COCHE 2");
		System.out.println("MARCA: "+coche2.marca);
		System.out.println("COLOR: "+coche2.color);
		System.out.println("KILOMETRAJE: "+coche2.km+" KM");
	}
}