package Pr�cticas;

import javax.swing.JOptionPane;

public class �conos {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "REINICIAR", "REINICIE SU EQUIPO", JOptionPane.WARNING_MESSAGE); //�CONO DE PELIGRO
		JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA", "CUIDADO", JOptionPane.OK_OPTION); //�CONO DE X ROJA
		JOptionPane.showMessageDialog(null, "ACCI�N EJECUTADA CORRECTAMENTE", "LISTO", JOptionPane.CLOSED_OPTION); //SIN �CONO
		JOptionPane.showMessageDialog(null, "ALGO ANDA MAL", "FALLA", JOptionPane.ERROR_MESSAGE); //�CONO DE X ROJA
	}
}