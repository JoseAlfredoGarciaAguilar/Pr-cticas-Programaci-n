package Pr�cticas;
//PREGUNTA SI VICTOR ES MUJER. MIENTRAS QUE DIGA QUE NO, SE ACUMULA Y AL FINAL MUESTRA SU N�MERO DE CNOS
public class tussenos {

	public static void main(String[] args) {
		cojan();
	}
	
	public static void cojan() {
		int t=-1;
		char r;
		do {
			do {
				System.out.print("�VICTOR ES MUJER?   S=S�   N=NO: ");
				r = Leer.datocar();
				t++;
				if(r!='s'&&r!='S'&&r!='n'&&r!='N') {
					System.out.println("ESCRIBE BIEN, IMB�CIL");
				}
				if(r=='s'||r=='S') {
					System.out.println("HASTA QUE ESCRIBISTE BIEN HIJO DE TU PUTA MADRE");
				}
				if(r=='n'|r=='N') {
					System.out.println("NA CREO");
				}
			}while(r!='s'&&r!='S'&&r!='n'&&r!='N');
		}while(r=='n'|r=='N');
		
		System.out.println("VICTOR TIENE " + t + " CNOS");
	}
}