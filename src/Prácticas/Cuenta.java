package Pr�cticas;
//SIMULA EL RETIRO DE UNA CUENTA BANCARIA DE UNA SOLA PERSONA. AL TERMINAR UNA PERSONA, PREGUNTA SI SE QUIERE SEGUIR CON OTRA. LUEGO MUESTRA EL N�MERO
//DE CLIENTES QUE QUEDARON CON $0 DE SALDO, Y EL N�MERO DE CLIENTES TOTALES
public class Cuenta {

	public static void main(String[] args) {
		boolean boleano = false;
		int eleccion = 0, resp = 0, acum = 1, saldo_0 = 0; //SE INICIALIZA EN 1 PORQUE POR DEFECTO YA SE AGREG� UNA PERSONA
		double retirar = 0, nuevo_saldo = 0;
		System.out.println("\tBANCOMER");
		do {
			System.out.print("�C�MO TE LLAMAS?: ");
			String nom = Leer.dato();
			System.out.println("BIENVENIDO " + nom);
			//EL SALDO DEL CLIENTE SE GENERA ALEATORIAMENTE
			double saldo_actual = Math.random()*1000000;
			System.out.println(nom + ", TU SALDO ACTUAL ES $" + saldo_actual);
			do {
				System.out.print("�DESEAS RETIRAR DINERO?:   1-S�   2-NO: ");
				eleccion = Leer.datoInt();
				if(eleccion==1) {
					do {
						System.out.print("�CU�NTO QUIERES RETIRAR?: ");
						retirar = Leer.datoDouble();
						if(retirar<saldo_actual) {
							nuevo_saldo = saldo_actual - retirar;
							System.out.println("RETIRASTE $" + retirar + ". TU NUEVO SALDO ES $" + nuevo_saldo);
							if(nuevo_saldo > 10000) {
							}
						}
						else if(retirar==saldo_actual) {
							System.out.println("RETIRASTE TODO LO QUE TEN�AS. TU NUEVO SALDO ES $0");
							saldo_0++;
						}
						else if(retirar>saldo_actual) {
							System.out.println("NO PUEDES RETIRAR TANTO...");
							System.out.println("TU SALDO ES $" + saldo_actual + ". NO PUEDES RETIRAR $" + retirar);
						}
					}while(retirar>saldo_actual);
				}
				else if(eleccion==2) {
					System.out.println("NO RETIRASTE. TE QUEDAS CON $" + saldo_actual + ". FIN");
				}
				else if(eleccion!=1&&eleccion!=2) {
					System.out.println("OPCI�N INV�LIDA...");
				}
			}while(eleccion!=1&&eleccion!=2);
			System.out.println();
			
			do {
				System.out.print("�DESEAS AGREGAR A OTRA PERSONA?:   1-S�   2-NO: ");
				resp = Leer.datoInt();
				if(resp==1) {
					boleano=true;
					acum++;
				}
				else if(resp==2) {
					if(acum==1) {
						System.out.println("AGREGASTE A 1 PERSONA");
					}
					else if(acum>1) {
						System.out.println("AGREGASTE A " + acum + " PERSONAS");
					}
					System.out.println("N�MERO DE PERSONAS QUE SE QUEDARON SIN SALDO: " + saldo_0);
					System.out.println("HAS SALIDO DE BANCOMER. FIN");
					boleano=false;
				}
				else if(resp!=1&&resp!=2) {
					System.out.println("OPCI�N INV�LIDA...");
				}
			}while(resp!=1&&resp!=2);
		}while(boleano==true);
	}
}