package Prácticas;

public class ContadorDoWhile {

	public static void main(String[] args) {
		int N=3, acum=0;
		char elecc='s';
		
		System.out.println("CABEN " + N);
		do {
			System.out.print("NOMBRE: ");
			String nom = Leer.dato();
			
			if(acum<N) {
				do {
					System.out.print("¿DESEAS AGREGAR OTRO?:   S=SÍ   N=NO: ");
					elecc = Leer.datocar();
					if(elecc!='s'&&elecc!='n') {
						System.out.println("OPCIÓN INVÁLIDA...");
					}
				}while(elecc!='s'&&elecc!='n');
				
				int aun = N-acum-1;
				if(aun>0) {
					System.out.println("AÚN PUEDES AGREGAR " + (aun) + "");
				}
				else if(aun==0) {
					System.out.println("LLENO");
				}
			}
			
			if(elecc=='s'||elecc=='S') {
				acum++;
			}
		}while(elecc=='s'||acum!=N);
	}
}