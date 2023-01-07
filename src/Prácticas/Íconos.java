package Prácticas;

import javax.swing.JOptionPane;

public class Íconos {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "REINICIAR", "REINICIE SU EQUIPO", JOptionPane.WARNING_MESSAGE); //ÍCONO DE PELIGRO
		JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA", "CUIDADO", JOptionPane.OK_OPTION); //ÍCONO DE X ROJA
		JOptionPane.showMessageDialog(null, "ACCIÓN EJECUTADA CORRECTAMENTE", "LISTO", JOptionPane.CLOSED_OPTION); //SIN ÍCONO
		JOptionPane.showMessageDialog(null, "ALGO ANDA MAL", "FALLA", JOptionPane.ERROR_MESSAGE); //ÍCONO DE X ROJA
	}
}