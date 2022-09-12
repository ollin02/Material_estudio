package Deportes;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
	private JPanel panel;
	private JLabel etiqueta;
	private JRadioButton rb1,rb2,rb3,rb4;
	
	public Ventana() {
		setSize(700,400);
		setTitle("Deportes");
		setLocationRelativeTo(null);
		
		
		inicaiarComponenetes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void inicaiarComponenetes() {
		colocarPanel();
		colocarEtiqueta();
		colocarRadioBotones();
	}
	
	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);		
	}
	
	private void colocarEtiqueta() {
		etiqueta = new JLabel("Escoja su deporte favorito");
		etiqueta.setBounds(20, 10, 250, 40);
		etiqueta.setFont(new Font("arail",0,18));
		panel.add(etiqueta);
	}
	
	private void colocarRadioBotones() {
		rb1 = new JRadioButton("Fútbol");
		rb1.setBounds(20, 80, 100, 40);
		rb1.setFont(new Font("arial rounded mt bold",0,18));
		panel.add(rb1);
		
		rb2 = new JRadioButton("Baloncesto");
		rb2.setBounds(20, 140, 150, 40);
		rb2.setFont(new Font("arial rounded mt bold",0,18));
		panel.add(rb2);
		
		rb3 = new JRadioButton("Tenis");
		rb3.setBounds(20, 200, 150, 40);
		rb3.setFont(new Font("arial rounded mt bold",0,18));
		panel.add(rb3);
		
		rb4 = new JRadioButton("Natacion");
		rb4.setBounds(20, 260, 150, 40);
		rb4.setFont(new Font("arial rounded mt bold",0,18));
		panel.add(rb4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rb1);
		grupo.add(rb2);
		grupo.add(rb3);
		grupo.add(rb4);
		
	}
}
