package Prácticas;
//SE PIDEN DATOS DE N PERSONAS, Y SE IMPRIME EL NOMBRE Y PESO DE LA PERSONA DE MAYOR PESO
public class UsoPeso {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTAS PERSONAS SON?: ");
		int x = Leer.datoInt();
		
		Peso[] peso = new Peso[x];
		
		PreguntaDatos(peso);
		MayorPeso(peso);
	}
	
	//SE PIDEN LOS DATOS DE LAS PERSONAS
	public static void PreguntaDatos(Peso[] peso) {
		for(int a=0; a<peso.length; a++) {
			System.out.println();
			System.out.print("NOMBRE " + (a+1) + ": ");
			String nom = Leer.dato();
			System.out.print("PESO EN KG DE " + nom + ": ");
			double pes = Leer.datoDouble();
			
			peso[a] = new Peso(nom, pes);
		}
	}
	
	//SE IMPRIME EL NOMBRE Y PESO DE LA PERSONA DE MAYOR PESO
	public static void MayorPeso(Peso[] peso) {
		String nombre_mayor="";
		double peso_mayor=0;
		for(int c=0; c<peso.length; c++) {
			if(peso[c].getPeso() > peso_mayor) {
				nombre_mayor = peso[c].getNombre();
				peso_mayor = peso[c].getPeso();
			}
		}
		System.out.println();
		System.out.println(nombre_mayor + " ES QUIEN MÁS PESA, CON " + peso_mayor + " KILOS");
	}
}