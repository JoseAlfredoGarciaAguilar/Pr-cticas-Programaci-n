package Prácticas;

public class ValidaString {

	public static void main(String[] args) {
		System.out.print("NÚMERO DE PERSONAS: ");
		int num = Leer.datoInt();
		
		String[] v = new String[num];
		
		Preguntar(v);
	}
	
	public static void Preguntar(String[] v) {
		String nom;
		for(int i=0; i<v.length; i++) {
			do {
				System.out.print("NOMBRE " + (i+1) + ": ");
				nom = Leer.dato();
				if(nom==v[i]) {
					System.out.println("NOMBRE YA EXISTENTE");
				}
			}while(nom==v[i]);
		}
	}
}