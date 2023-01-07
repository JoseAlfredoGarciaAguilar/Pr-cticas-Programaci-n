package Prácticas;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PesoWarning {
	
	public PesoWarning() {
		Imagen();
	}

	public static void main(String[] args) {
		new PesoWarning();
	}
	
	public void Imagen() {
		int peso = Integer.parseInt(JOptionPane.showInputDialog("INGRESA TU PESO ENTERO: "));
		Icon icono = new ImageIcon(getClass().getResource("desktop/carafeliz.jpeg"));

		if(peso >= 100) {
			JOptionPane.showMessageDialog(null, "¡CUIDA MÁS TU PESO!", "¡CUIDADO!", JOptionPane.WARNING_MESSAGE);
		}
		if(peso < 100) {
			JOptionPane.showMessageDialog(null, "TIENES UN BUEN PESO", "SIGUE ASÍ", JOptionPane.PLAIN_MESSAGE, icono);
		}
	}
}