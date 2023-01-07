package Prácticas;
import javax.swing.JOptionPane;
//SE PREGUNTA LA EDAD Y SE IMPRIME CON JOPTIONPANE
public class Edad {

	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("¿CUÁNTOS AÑOS TIENES?: "));
		JOptionPane.showMessageDialog(null, "TIENES " + edad + " AÑOS", "TU EDAD", JOptionPane.CLOSED_OPTION);
	}
}