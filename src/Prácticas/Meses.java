package Prácticas;
import javax.swing.JOptionPane;
//SE PREGUNTA EL NÚMERO DEL MES Y SE IMPRIME SU NOMBRE
public class Meses {

	public static void main(String[] args) {
		int mes=0;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DE MES: "), JOptionPane.QUESTION_MESSAGE);
			if(mes<1 || mes>12) {
				JOptionPane.showMessageDialog(null, "MES NO EXISTENTE. PRUEBA DE NUEVO", "ERROR", JOptionPane.OK_OPTION);
			}
		}while(mes<1 || mes>12);
		
		String salida="";
		if(mes==1) {
			salida = "ENERO";
		}
		else if(mes==2) {
			salida = "FEBRERO";
		}
		else if(mes==3) {
			salida = "MARZO";
		}
		else if(mes==4) {
			salida = "ABRIL";
		}
		else if(mes==5) {
			salida = "MAYO";
		}
		else if(mes==6) {
			salida = "JUNIO";
		}
		
		JOptionPane.showMessageDialog(null, salida, "MES", JOptionPane.DEFAULT_OPTION);
	}
}