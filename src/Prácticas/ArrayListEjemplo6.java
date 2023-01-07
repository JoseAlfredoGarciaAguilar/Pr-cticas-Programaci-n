package Prácticas;
import java.util.ArrayList;
//SIMULA UNA PEQUEÑA AGENDA DE CONTACTOS
public class ArrayListEjemplo6 {

	public static void main(String[] args) {
		int elecc=0;
		char preg, opc;
		ArrayList<String> arreglo = new ArrayList<String>();
		do {
			do {
				System.out.println("MENÚ DE OPCIONES");
				System.out.println("1-AGREGAR UNO");
				System.out.println("2-IMPRIMIR EN LISTA");
				System.out.println("3-IMPRIMIR EN COLUMNA");
				System.out.println("4-ELIMINAR UNO");
				System.out.println("5-ELIMINAR TODO");
				System.out.print("ELIGE: ");
				elecc = Leer.datoInt();
				if(elecc<1||elecc>4) {
					System.out.println("OPCIÓN INVÁLIDA...");
				}
			}while(elecc<1||elecc>4);
			
			if(elecc==1) {
				System.out.println();
				System.out.println("AGREGAR PERSONA");
				System.out.print("NOMBRE: ");
				String nom = Leer.dato();
				arreglo.add(nom);
			}
			else if(elecc==2) {
				System.out.println();
				System.out.println("LISTA");
				for(int a=0; a<arreglo.size(); a++) {
					System.out.println((a+1) + " - " + arreglo.get(a));
				}
			}
			else if(elecc==3) {
				System.out.println();
				System.out.println("LISTA EN COLUMNA");
				System.out.println(arreglo);
			}
			else if(elecc==4) {
				System.out.println();
				System.out.println("ELIMINAR UNO");
				System.out.print("NÚMERO DE PERSONA A ELIMINAR: ");
				int x = Leer.datoInt();
				arreglo.remove(x-1);
			}
			else if(elecc==5) {
				System.out.println();
				System.out.println("ELIMINAR TODO");
				System.out.println("TODO HA SIDO ELIMINADO");
				arreglo.clear();
			}
			
			do {
				System.out.println();
				System.out.print("¿DESEAS HACER ALGO MÁS?:   S=SÍ   N=NO: ");
				preg = Leer.datocar();
				System.out.println();
				if(preg!='S'&&preg!='s'&&preg!='N'&&preg!='n') {
					System.out.println("OPCIÓN INVÁLIDA...");
				}
				else if(preg=='N'||preg=='n') {
					System.out.println("FIN DEL PROGRAMA");
				}
			}while(preg!='S'&&preg!='s'&&preg!='N'&&preg!='n');
			
		}while(preg=='S'||preg=='s');
	}
}