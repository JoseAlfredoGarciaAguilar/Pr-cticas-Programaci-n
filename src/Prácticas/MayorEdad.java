package Pr�cticas;
//SE PIDEN N PERSONAS CON SUS ESTATURAS. SI MIDE 1.70 MT O M�S, SE CONSIDERA ALTA. SINO, BAJA
public class MayorEdad {

	public static void main(String[] args) {
		System.out.print("�CU�NTAS PERSONAS VAS A INGRESAR?: ");
		int N = Leer.datoInt();
		int[] arreglo = new int[N];
		double mayor=0, menor=0;
		
		int ed=0;
		System.out.println("SE PEDIR�N " + arreglo.length + " PERSONAS");
		System.out.println();
		for(int a=0; a<arreglo.length; a++) {
			do{
				System.out.print("EDAD PERSONA " + (a+1) + ": ");
				ed = Leer.datoInt();
				if(ed < 0 || ed >= 120) {
					System.out.println("EDAD INV�LIDA. PRUEBA DE NUEVO");
				}
			}while(ed < 0 || ed >= 120);
			
			if(ed >= 18) {
				mayor++;
			}
			if(ed < 18) {
				menor++;
			}
		}
		double porc_mayor = (mayor/arreglo.length)*100;
		double porc_menor = (menor/arreglo.length)*100;
		
		System.out.println();
		System.out.println("MAYORES Y MENORES");
		System.out.println("MAYORES DE EDAD: " + mayor);
		System.out.println("MENORES DE EDAD: " + menor);
		System.out.println();
		System.out.println("PORCENTAJES");
		System.out.println("MAYORES DE EDAD: " + porc_mayor + "%");
		System.out.println("MENORES DE EDAD: " + porc_menor + "%");
	}
}