package Musica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Musica extends JFrame implements ActionListener, WindowListener{
	private static final long serialversionUID = 1L;
	private JMenuBar mbMenu; //JMenuBar representa la barra de menú del programa
	private JMenu mPop, mRock; //JMenu se añade a JMenuBar y contiene los items del menú
	//Menu Pop
	private JMenuItem ArianaGrande, BillieEilish; //JMenuItem se añade a JMenu y contiene los hijos de las opciones del menú
	//Menu Rock
	private JMenuItem ImagineDragons, ACDC;
	
	public Musica() {
		setTitle("Musiquitas"); //Le da título a la ventana
		setLayout(new BorderLayout()); //BorderLayout divide la ventana en 5 zonas (central, arriba, abajo, izquierda y derecha)
		setSize(500,500); //setSize establece el tamaño de la ventana
		setExtendedState(MAXIMIZED_BOTH); //
		setDefaultCloseOperation(EXIT_ON_CLOSE); //setDefaultCloseOperation define lo que pasará al cerrar la aplicación. Exit on Close hace que se cierre tanto la ventana como el proceso
		setIconImage(new ImageIcon("Imagenes/icono.png").getImage()); //setIconImage permite darle un icono a la ventana
		addWindowListener(this);
		InitComponents();
	}

	private void InitComponents() {
		Menu();
	}
	
	private void Menu() {
		mbMenu = new JMenuBar();
		//POP
		mPop = new JMenu("Pop");
		mPop.setMnemonic('P');
		//Ariana Grande
		ArianaGrande = new JMenuItem("Ariana Grande");
		ArianaGrande.addActionListener(this);
		ArianaGrande.setMnemonic('A');
		mPop.add(ArianaGrande);
		//Billie Eilish
		BillieEilish = new JMenuItem("Billie Eilish");
		BillieEilish.addActionListener(this);
		BillieEilish.setMnemonic('B');
		mPop.add(BillieEilish);
		
		//ROCK
		mRock = new JMenu("Rock");
		mRock.setMnemonic('R');
		//Imagine Dragons
		ImagineDragons = new JMenuItem("Imagine Dragons");
		ImagineDragons.addActionListener(this);
		ImagineDragons.setMnemonic('I');
		mRock.add(ImagineDragons);
		//ACDC
		ACDC = new JMenuItem("AC/DC");
		ACDC.addActionListener(this);
		ACDC.setMnemonic('A');
		mRock.add(ACDC);
		
		mbMenu.add(mPop);
		mbMenu.add(mRock);
		setJMenuBar(mbMenu);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}