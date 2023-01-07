package Topicos;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	public Ventana() {
		setSize(500,300); //Establecemos el tamaño de la ventana
		//Ancho, Largo
		setTitle("Ventanita <3"); //Establecemos el título de la ventana
		setLocation(100, 200); //Establecemos la posicion inicial de la ventana
		//Todos los tamaños de las ventanas y las posiciones se trabajan con píxeles
		setBounds(100, 200, 500, 500);//SetBounds sirve para lo mismo que setSize y setLocation pero junto. Engloba ambos y sirve para ahorrar código
		//posicion de x, posicion de y, ancho, largo
		setLocationRelativeTo(null); //Hace que la ventana aparezca en el centro de la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Terminamos la ejecucion del programa al presionar la x	
		getContentPane().setBackground(Color.GREEN); //Le damos un color a toda la ventana
		
		InitComponents(); //Ejecutamos el metodo
	}
	
	//Inicializar componentes
	private void InitComponents() {
		JPanel panel = new JPanel(); //Creacion de un panel
		panel.setBackground(Color.BLUE); //Establecemos el color del panel
		panel.setLayout(null); //Desactivando el diseño
		getContentPane().add(panel); //Agregamos el panel a la ventana
		
		JLabel label = new JLabel(); //Creamos una etiqueta
		label.setText("Hola"); //Establecemos el texto de la etiqueta
		label.setBounds(10, 10, 50, 30);
		label.setForeground(Color.ORANGE); //Establecemos el color de la letra
		label.setOpaque(true); //Establecemos pintar el fondo de la etiqueta. true para aceptarlo, false para que siga igual
		label.setBackground(Color.WHITE); //Cambiamos el color de fondo de la etiqueta
		panel.add(label); //Agregamos la etiqueta al panel
		
		
	}
}