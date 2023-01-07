package Prácticas;
import javax.swing.JOptionPane;
//SE IMPRIMEN MENSAJES CON ÍCONOS DE PELIGRO
public class Warning {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "SU COMPUTADORA ESTÁ EN RIESGO, ¡INSTALE UN ANTIVIRUS!", "¡CUIDADO!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "REINICIE SU PC", "LIMPIEZA", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "PROBLEMAS EN EL DISCO DURO", "ALERTA", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "¡SU PC ESTÁ A PUNTO DE EXPLOTAR!", "¡CORRA!", JOptionPane.WARNING_MESSAGE);
	}
}