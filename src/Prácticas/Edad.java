package Pr�cticas;
import javax.swing.JOptionPane;
//SE PREGUNTA LA EDAD Y SE IMPRIME CON JOPTIONPANE
public class Edad {

	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("�CU�NTOS A�OS TIENES?: "));
		JOptionPane.showMessageDialog(null, "TIENES " + edad + " A�OS", "TU EDAD", JOptionPane.CLOSED_OPTION);
	}
}