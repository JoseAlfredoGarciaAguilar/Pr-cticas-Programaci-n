package Pr�cticas;
//SE PIDEN N CALIFICACIONES DE UN ALUMNO Y SE CALCULA SU PROMEDIO
public class PromedioN {

	public static void main(String[] args) {
		double calif=0, suma=0, prom=0;
		System.out.print("�C�MO SE LLAMA EL ALUMNO?: ");
		String nom = Leer.dato();
		System.out.print("�CU�NTAS CALIFICACIONES DE " + nom + " SON?: ");
		int N = Leer.datoInt();
		
		System.out.println();
		for(int a=0; a<N; a++) {
			System.out.print("CALIFICACI�N " + (a+1) + ": ");
			calif =  Leer.datoDouble();
			suma = suma + calif;
			prom = (suma/N);
		}
		System.out.println();
		System.out.println("PROMEDIO DE " + nom + ": " + prom);
	}
}