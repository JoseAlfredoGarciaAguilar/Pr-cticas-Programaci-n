package Prácticas;
//CALCULA EL IMC Y ESTADO CORPORAL DE N PERSONAS
public class UsoIMC {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTAS PERSONAS SON?: ");
		int N = Leer.datoInt();
		IMC[] arreglo = new IMC[N];
		
		Pedir(arreglo);
		Calcular(arreglo);
		Resultados(arreglo);
	}
	
	public static void Pedir(IMC[] arreglo) {
		double pes=0, est=0;
		if(arreglo.length!=0) {
			System.out.println("CAPTURA DE DATOS");
			for(int i=0; i<arreglo.length; i++) {
				System.out.print("NOMBRE " + (i+1) + ": ");
				String nom = Leer.dato();
				do {
					System.out.print("PESO DE " + nom + " (10-250) EN KG: ");
					pes = Leer.datoInt();
					if(pes<1||pes>250) {
						System.out.println("PESO INVÁLIDO...");
					}
				}while(pes<1||pes>250);
				do {
					System.out.print("ESTATURA DE " + nom + " EN METROS (1.20-2.50): ");
					est = Leer.datoDouble();
					if(est<1.2||est>2.5) {
						System.out.println("ESTATURA INVÁLIDA...");
					}
				}while(est<1.2||est>2.5);
				System.out.println();
				
				arreglo[i] = new IMC(nom, pes, est);
			}
		}
	}
	
	public static void Calcular(IMC[] arreglo) {
		for(int j=0; j<arreglo.length; j++) {
			arreglo[j].GeneraIMC();
		}
	}
	
	public static void Resultados(IMC[] arreglo) {
		System.out.println();
		for(int k=0; k<arreglo.length; k++) {
			arreglo[k].Salud();
		}
	}
}