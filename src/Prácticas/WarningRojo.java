package Pr�cticas;
import javax.swing.JOptionPane;
//IMPRIME MENSAJES CON UNA TACHA ROJA COMO �CONO
public class WarningRojo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ERROR EN EL DISCO DURO", "REPARACI�N", JOptionPane.OK_OPTION);
		JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO INESPERADAMENTE", "ERROR", JOptionPane.OK_OPTION);
		JOptionPane.showMessageDialog(null, "SAL DE AH� ESPONJA", "ALERTA", JOptionPane.OK_OPTION);
	}
}