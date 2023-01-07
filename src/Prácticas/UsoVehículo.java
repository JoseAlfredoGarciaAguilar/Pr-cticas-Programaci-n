package Prácticas;

public class UsoVehículo {

	public static void main(String[] args) {
		System.out.println("\tVEHÍCULOS");
		System.out.print("¿CUÁNTOS CARROS VAS A GUARDAR?: ");
		int car = Leer.datoInt();
		System.out.print("¿CUÁNTOS CAMIONES VAS A GUARDAR?: ");
		int cam = Leer.datoInt();
		
		Carro[] carro = new Carro[car];
		Camión[] camion = new Camión[cam];
		
		PedirCarros(carro);
		PedirCamiones(camion);
		ImprimirCarros(carro);
	}
	
	//SE PIDEN LOS CARROS
	public static void PedirCarros(Carro[] carro) {
		if(carro.length!=0) {
			int marca=0, color=0, puertas=0, trans=0;
			double cilin=0;
			System.out.println("-CAPTURA DE CARROS-");
			for(int a=0; a<carro.length; a++) {
				//SE VALIDA QUE SE INGRESE UNA MARCA DE LAS 3 OPCIONES
				do {
					System.out.print("MARCA DEL CARRO " + (a+1) + ":   1-CHEVROLET   2-FORD   3-NISSAN: ");
					marca = Leer.datoInt();
					if(marca!=1 && marca!=2 && marca!=3) {
						System.out.println("MARCA INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(marca!=1 && marca!=2 && marca!=3);
				//SE VALIDA QUE SE INGRESE UN COLOR DE LAS 3 OPCIONES
				do {
					System.out.print("COLOR DEL CARRO " + (a+1) + ":   1-NEGRO   2-BLANCO   3-GRIS: ");
					color = Leer.datoInt();
					if(color!=1 && color!=2 && color!=3) {
						System.out.println("COLOR INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(color!=1 && color!=2 && color!=3);
				//SE VALIDA QUE SE INGRESE UN CILINDRAJE ENTRE 1 Y 8
				do {
					System.out.print("CILINDRAJE DE GASOLINA DEL CARRO " + (a+1) + ": ");
					cilin = Leer.datoDouble();
					if(cilin<1) {
						System.out.println("NINGÚN CARRO TIENE MENOS DE 1 CILINDRO. PRUEBA DE NUEVO");
					}
					if(cilin>8) {
						System.out.println("NINGÚN CARRO TIENE MÁS DE 8 CILINDROS. PRUEBA DE NUEVO");
					}
				}while(cilin<1 && cilin>8);
				//SE VALIDA QUE SE INGRESE UN NÚMERO DE PUERTAS ENTRE 2 Y 5
				do {
					System.out.print("NÚMERO DE PUERTAS DEL CARRO "  + (a+1) + ": ");
					puertas = Leer.datoInt();
					if(puertas<2) {
						System.out.println("NINGÚN CARRO TIENE MENOS DE 2 PUERTAS. PRUEBA DE NUEVO");
					}
					if(puertas>5) {
						System.out.println("NINGÚN CARRO TIENE MÁS DE 5 PUERTAS. PRUEBA DE NUEVO");
					}
				}while(puertas<2 || puertas>5);
				//SE VALIDA QUE SE INGRESE UNA TRANSMISIÓN DE LAS 2 OPCIONES
				do {
					System.out.print("TRANSMISIÓN DEL CARRO " + (a+1) + ":   1-AUTOMÁTICA   2-ESTÁNDAR");
					trans = Leer.datoInt();
					if(trans!=1 && trans!=2) {
						System.out.println("TRANSMISIÓN INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(trans!=1 && trans!=2);
				
				//SE GUARDAN LOS DATOS
				carro[a] = new Carro(marca, color, cilin, puertas, trans);
		}
		}
	}
	
	//SE PIDEN LOS CAMIONES
	public static void PedirCamiones(Camión[] camion) {
		if(camion.length!=0) {
			int marca=0, color=0, ruta=0, capacidad=0;
			double cilin=0;
			System.out.println("-CAPTURA DE CAMIONES-");
			for(int b=0; b<camion.length; b++) {
				//SE VALIDA QUE SE INGRESE UNA MARCA DE LAS 3 OPCIONES
				do {
					System.out.print("MARCA DEL CAMIÓN " + (b+1) + ":   1-MERCEDES-BENZ   2-RENAULT TRUCKS   3-VOLVO: ");
					marca = Leer.datoInt();
					if(marca!=1 && marca!=2) {
						System.out.println("MARCA INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(marca!=1 && marca!=2);
				//SE VALIDA QUE SE INGRESE UN COLOR DE LAS 3 OPCIONES
				do {
					System.out.print("COLOR DEL CAMIÓN " + (b+1) + ":   1-VERDE   2-TINTO   3-BLANCO: ");
					color = Leer.datoInt();
					if(color!=1 && color!=2 && color!=3) {
						System.out.println("COLOR INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(color!=1 && color!=2 && color!=3);
				//SE VALIDA QUE SE INGRESE UN CILINDRAJE ENTRE 8 Y 16
				do {
					System.out.print("CILINDRAJE DE DIESEL DEL CAMIÓN " + (b+1) + ": ");
					cilin = Leer.datoDouble();
					if(cilin<8) {
						System.out.println("NINGÚN CAMIÓN TIENE MENOS DE 8 CILINDROS. PRUEBA DE NUEVO");
					}
					if(cilin>16) {
						System.out.println("NINGÚN CAMIÓN TIENE MÁS DE 16 CILINDROS. PRUEBA DE NUEVO");
					}
				}while(cilin<8 || cilin>16);
				//SE VALIDA QUE SE INGRESE UNA RUTA DE LAS 4 OPCIONES
				do {
					System.out.print("RUTA DEL CAMIÓN " + (b+1) + ":   1-MANDARINA   2-BUENOS AIRES   3-LOMITA-CAÑADAS   4-DIAZ ORDAZ: ");
					ruta = Leer.datoInt();
					if(ruta!=1 && ruta!=2 && ruta!=3 && ruta!=4) {
						System.out.println("RUTA INEXISTENTE. PRUEBA DE NUEVO");
					}
				}while(ruta!=1 && ruta!=2 && ruta!=3 && ruta!=4);
				//SE VALIDA QUE SE INGRESE UNA CAPACIDAD ENTRE 10 Y 70 PERSONAS
				do {
					System.out.print("CAPACIDAD DE PERSONAS DEL CAMIÓN " + (b+1) + ": ");
					capacidad = Leer.datoInt();
					if(capacidad<10) {
						System.out.println("NINGÚN CAMIÓN TIENE UNA CAPACIDAD MENOR A 10 PERSONAS. PRUEBA DE NUEVO");
					}
					if(capacidad>70) {
						System.out.println("NINGÚN CAMIÓN TIENE UNA CAPACIDAD MAYOR A 70 PERSONAS. PRUEBA DE NUEVO");
					}
				}while(capacidad<10 || capacidad>70);
		}
		}
	}
	
	//SE IMPRIMEN LOS CARROS
	public static void ImprimirCarros(Carro[] carro) {
		if(carro.length!=0) {
			System.out.println("-MUESTRA DE LOS CARROS-");
			for(int c=0; c<carro.length; c++) {
				System.out.println((c+1) + "- " + carro[c].ToStringCarro());
			}
		}
	}
}
