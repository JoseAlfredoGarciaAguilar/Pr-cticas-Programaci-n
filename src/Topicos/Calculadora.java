package Topicos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private JPanel jpCentro;
	private JButton btnSuma, btnResta, btnMult, btnDiv;
	
	public Calculadora() {
		setSize(600,600);
		setTitle("Calculadora básica xd");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		InitComponents();
	}

	private void InitComponents() {
		jpCentro = new JPanel();
		jpCentro.setLayout(new FlowLayout());
		jpCentro.setBackground(Color.BLUE);
		jpCentro.add(new JLabel("Centro"));
		
		btnSuma = new JButton("+");
		btnSuma.addActionListener(this);
		btnSuma.setPreferredSize(new Dimension(80,80));
		btnSuma.setBackground(Color.PINK);
		jpCentro.add(btnSuma);	
		
		btnResta = new JButton("-");
		btnResta.addActionListener(this);
		btnResta.setPreferredSize(new Dimension(80,80));
		btnResta.setBackground(Color.CYAN);
		jpCentro.add(btnResta);
		
		btnMult = new JButton("x");
		btnMult.addActionListener(this);
		btnMult.setPreferredSize(new Dimension(80,80));
		btnMult.setBackground(Color.YELLOW);
		jpCentro.add(btnMult);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		btnDiv.setPreferredSize(new Dimension(80,80));
		btnDiv.setBackground(Color.MAGENTA);
		jpCentro.add(btnDiv);
		add(jpCentro, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
