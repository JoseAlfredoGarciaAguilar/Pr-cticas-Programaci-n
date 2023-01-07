package Prácticas;
import javax.swing.JOptionPane;
//PIDE N NÚMEROS Y CUENTA LOS NEGATIVOS
public class Negativo {

	public static void main(String[] args) {
		int num, cont=0;
		System.out.print("¿CUÁNTOS NÚMEROS VAS A PEDIR?: ");
		int N = Leer.datoInt();
		
		for(int i=1; i<=N; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO " + i + ": "));
			
			if(num<0) { //SI EL NÚMERO ES NEGATIVO
				cont++;
			}
		}
		
		if(cont==0) {
			System.out.println("NO HAY NÚMEROS NEGATIVOS");
		}else {
			System.out.println("HAY " + cont + " NÚMEROS NEGATIVOS");
		}
	}
}