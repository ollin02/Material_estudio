package ConteoBotones;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicButtonListener;

public class Ventana extends JFrame{
	private JPanel panel;
	private JLabel etiqueta;
	private JButton boton;
	private int contador=0;
	
	public Ventana() {
		setSize(400,400);//Tamaño Ventana
		setTitle("Coteo Click");//Titulo de la Ventan
		setLocationRelativeTo(null);//Venrtana al centro de la pantalla
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarBoton();
	}
	
	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);		
	}
	
	private void colocarEtiqueta() {
		etiqueta=new JLabel();
		etiqueta.setBounds(0, 50, 400, 40);
		etiqueta.setText("Pulsa el boton");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("aria",0,20));
		panel.add(etiqueta);
	}
	
	private void colocarBoton() {
		boton = new JButton();
		boton.setBounds(90, 250, 200, 50);
		boton.setText("Pulsa aquí");
		boton.setFont(new Font("cooper black",0,20));
		panel.add(boton);
		
		eventoDeAccion();
	}
	
	private void eventoDeAccion() {
		ActionListener eventoAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contador++;
				if(contador==1) {
					etiqueta.setText("Has presionado el botón 1 vez");
				}else {
					etiqueta.setText("Has precionado el boton "+contador+" veces");
				}
			}
			
		};
		boton.addActionListener(eventoAccion);
	}
}
