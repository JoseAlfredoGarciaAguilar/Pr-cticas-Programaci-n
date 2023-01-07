package Prácticas;

public class UsoCliente {

	public static void main(String[] args) {
		boolean boleano=false;
		System.out.print("¿CUÁL ES LA CAPACIDAD MÁXIMA DE CLIENTES?: ");
		int N = Leer.datoInt();
		
		Cliente[] cliente = new Cliente[N];
		
		do {
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1-AGREGAR CLIENTE");
			System.out.println("2-BUSCAR CLIENTE");
			System.out.println("3-MOSTRAR LISTA DE CLIENTES");
			System.out.println("4-MOSTRAR NÚMERO DE HUECOS");
			int eleccion = Leer.datoInt();
			
			switch(eleccion) {
			case 1:
				Agregar(cliente);
				break;
			case 2:
				Buscar(cliente);
				break;
			/*case 3:
				MostrarLista();
				break;
			case 4:
				MostrarHuecos();
				break;
			default:
				System.out.println("OPCIÓN INVÁLIDA...");*/
			}
			
			System.out.println();
			System.out.print("¿QUIERES MOSTRAR EL MENÚ?:   1-SÍ   2-NO: ");
			int menu = Leer.datoInt();
			if(menu==1) {
				boleano=true;
			}
			else if(menu==2) {
				System.out.println("FIN DEL PROGRAMA");
				boleano=false;
			}
			if(menu<1||menu>2) {
				System.out.println("OPCIÓN INVÁLIDA...");
			}
		}while(boleano==true);
	}
	
	public static void Agregar(Cliente[] cliente) {
		String nom="";
		int opcion_retiro=0;
		double saldo=0, cantidad_retiro=0, nuevo_saldo=0;
		System.out.println();
		for(int a=0; a<1; a++) {
			if(cliente[a]==null) {
				System.out.print("NOMBRE DEL CLIENTE: ");
				nom = Leer.dato();
				System.out.print("SALDO ACTUAL DE " + nom + ": ");
				saldo = Leer.datoDouble();
				do {
					System.out.print("¿" + nom + " DESEA RETIRAR?:   1-SÍ   2-NO: ");
					opcion_retiro = Leer.datoInt();
					if(opcion_retiro==1) {
						do {
							System.out.print("CANTIDAD A RETIRAR: ");
							cantidad_retiro = Leer.datoDouble();
							if(cantidad_retiro>saldo) {
								System.out.println("NO ALCANZA EL SALDO PARA RETIRAR");
							}
							else if(cantidad_retiro<saldo) {
								nuevo_saldo = saldo - cantidad_retiro;
								System.out.println("NUEVO SALDO DE " + nom + ": $" + nuevo_saldo);
							}
						}while(cantidad_retiro>saldo);
						
					}
					else if(cantidad_retiro==2) {
						System.out.println("NO SE RETIRARÁ NADA");
						nuevo_saldo = saldo;
					}
					if(opcion_retiro<1||opcion_retiro>2) {
						System.out.println("OPCIÓN INVÁLIDA...");
					}
				}while(opcion_retiro<1||opcion_retiro>2);
			}
			
			for(int b=0; b<cliente.length; b++) {
				if(cliente[b]!=null){
					System.out.println("SIN ESPACIOS DISPONIBLES");
					}
			}
			
			cliente[a] = new Cliente(nom, saldo, opcion_retiro, nuevo_saldo);
		}
	}
	
	public static void Buscar(Cliente[] cliente) {
		String nom="", nom_null="";
		for(int c=0; c<cliente.length; c++) {
			do {
				System.out.println("NOMBRE DEL CLIENTE A BUSCAR: ");
				nom = Leer.dato();
				if(nom.equals(cliente[c].getNombre())) {
					nom = nom_null;
				}
			}while(nom_null.equals(cliente[c].getNombre()));
		}
	}
}