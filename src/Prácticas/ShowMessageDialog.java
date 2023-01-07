package Prácticas;
import javax.swing.JOptionPane;
//SE MUESTRA UN MENSAJE DE ADVERTENCIA CON UN ÍCONO DE PELIGRO
public class ShowMessageDialog {

	public static void main(String[] args) {
		//WARNING_MESSAGE SIRVE PARA MOSTRAR UN ÍCONO DE PELIGRO
		JOptionPane.showMessageDialog(null, "TENGA CUIDADO", "¡PELIGRO!", JOptionPane.WARNING_MESSAGE);
	}
}