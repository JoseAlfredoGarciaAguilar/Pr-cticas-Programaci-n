package Prácticas;
import javax.swing.JOptionPane;
//IMPRIME MENSAJES CON UNA TACHA ROJA COMO ÍCONO
public class WarningRojo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ERROR EN EL DISCO DURO", "REPARACIÓN", JOptionPane.OK_OPTION);
		JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO INESPERADAMENTE", "ERROR", JOptionPane.OK_OPTION);
		JOptionPane.showMessageDialog(null, "SAL DE AHÍ ESPONJA", "ALERTA", JOptionPane.OK_OPTION);
	}
}