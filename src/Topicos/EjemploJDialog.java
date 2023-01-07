package Topicos;

import java.awt.Container;
import javax.swing.JDialog;
//JDIALOG PERMITE CREAR VENTANAS. SE DIFERENCIA DE JFRAME EN QUE SOLO PERMITE CERRARLAS, PERO NO MINIMIZAR NI MAXIMIZAR
public class EjemploJDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private Container contenedor; //Se encarga de alojar los componentes que se quieren mostrar en la ventana
	private JDialog dialogo;
	
	public EjemploJDialog() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		setTitle("Título xd"); //Le damos titulo a la ventana
		setSize(300,300); //Le damos tamaño a la ventana
		setLocationRelativeTo(null); //Coloca la ventana justo en el centro de la pantalla
	}
}
