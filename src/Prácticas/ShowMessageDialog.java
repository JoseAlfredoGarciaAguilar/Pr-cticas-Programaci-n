package Pr�cticas;
import javax.swing.JOptionPane;
//SE MUESTRA UN MENSAJE DE ADVERTENCIA CON UN �CONO DE PELIGRO
public class ShowMessageDialog {

	public static void main(String[] args) {
		//WARNING_MESSAGE SIRVE PARA MOSTRAR UN �CONO DE PELIGRO
		JOptionPane.showMessageDialog(null, "TENGA CUIDADO", "�PELIGRO!", JOptionPane.WARNING_MESSAGE);
	}
}