package Pr�cticas;
import javax.swing.JOptionPane;
//SE IMPRIMEN MENSAJES CON �CONOS DE PELIGRO
public class Warning {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "SU COMPUTADORA EST� EN RIESGO, �INSTALE UN ANTIVIRUS!", "�CUIDADO!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "REINICIE SU PC", "LIMPIEZA", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "PROBLEMAS EN EL DISCO DURO", "ALERTA", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "�SU PC EST� A PUNTO DE EXPLOTAR!", "�CORRA!", JOptionPane.WARNING_MESSAGE);
	}
}