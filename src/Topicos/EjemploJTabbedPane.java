package Topicos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class EjemploJTabbedPane extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTabbedPane paneles;
	
	public EjemploJTabbedPane() {
		//Parametros asociados a la ventana	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		setTitle("Ejemplo JTabbedPane");
		
		//Creamos el conjunto de ventanas
		JTabbedPane pestañas = new JTabbedPane();
		
		//Creamos el panel y lo añadimos a las pestañas
		JPanel panel1 = new JPanel();
		
		//Componentes del panel 1
		JLabel et_p1 = new JLabel("Estás en el panel 1");
		panel1.add(et_p1);
		//Añadimos un nombre de la pestaña y el panel
		pestañas.addTab("Panel 1", panel1);
		
		JPanel panel2 = new JPanel();
		JLabel et_p2 = new JLabel("Estás en el panel 2");
		panel2.add(et_p2);
		pestañas.addTab("Panel 2", panel2);
		
		JPanel panel3 = new JPanel();
		JLabel et_p3 = new JLabel("Estás en el panel 3");
		panel3.add(et_p3);
		pestañas.addTab("Panel 3", panel3);
		
		JPanel panel4 = new JPanel();
		JLabel et_p4 = new JLabel("Estás en el panel 4");
		panel4.add(et_p4);
		pestañas.addTab("Panel 4", panel4);
		
		JPanel panel5 = new JPanel();
		JLabel et_p5 = new JLabel("Estás en el panel 5");
		panel5.add(et_p5);
		pestañas.addTab("Panel 5", panel5);
		
		//Añade componentes a un JFrame
		getContentPane().add(pestañas);
	}
}