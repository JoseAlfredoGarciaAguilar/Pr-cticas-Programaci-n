package Topicos;

import javax.swing.JFrame;
//JFRAME SIRVE PARA CREAR VENTANAS CON CIERTAS CARACTERÍSTICAS
public class EjemploJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	public EjemploJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que el programa se cierre de todos lados, no solo la ventana
		setSize(300,300); //Le damos un tamaño a la ventana
		setLocationRelativeTo(null); //Coloca la ventana justo en el centro de la pantalla
	}
}