package Pr�cticas;
import javax.swing.JOptionPane;
//PIDE N N�MEROS Y CUENTA LOS NEGATIVOS
public class Negativo {

	public static void main(String[] args) {
		int num, cont=0;
		System.out.print("�CU�NTOS N�MEROS VAS A PEDIR?: ");
		int N = Leer.datoInt();
		
		for(int i=1; i<=N; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("N�MERO " + i + ": "));
			
			if(num<0) { //SI EL N�MERO ES NEGATIVO
				cont++;
			}
		}
		
		if(cont==0) {
			System.out.println("NO HAY N�MEROS NEGATIVOS");
		}else {
			System.out.println("HAY " + cont + " N�MEROS NEGATIVOS");
		}
	}
}