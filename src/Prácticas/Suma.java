package Pr�cticas;
import javax.swing.JOptionPane;
//SE PIDEN DOS N�MEROS POR TECLADO Y SE MUESTRA EL RESULTADO POR JOPTIONPANE
public class Suma {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("N�MERO 1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("N�MERO 2: "));
		int suma=num1+num2;
		JOptionPane.showMessageDialog(null, "SUMA = " + suma);
	}
}