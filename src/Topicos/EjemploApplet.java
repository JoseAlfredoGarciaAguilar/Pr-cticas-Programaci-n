package Topicos;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
//UN APPLET ES UNA APLICACIÓN QUE PUEDE CORRER EN UN EXPLORADOR DE INTERNET
public class EjemploApplet extends JApplet {
	private static final long serialVersionUID = 1L;
	
	public void init() { //init sirve para inicializar el applet
		Container contenido = this.getContentPane();
		contenido.setLayout(new FlowLayout());
		
		contenido.add(new JLabel("Hola Mundo")); //Muestra algo de texto en la ventana
		contenido.add(new JButton("Clickeame!")); //Muestra un botón con texto
	}
}