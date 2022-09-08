package ventana_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;//Paque de graficos de java JFrame es una clases con la cual podemos poner ventanas
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Ventana extends JFrame{
	public Ventana() {
		setSize(500,500);//Estblecemos el tamño de la ventana
		setTitle("El mejor titulo");//Establecemos el titulo de la ventana
		//setLocation(100, 200);//Establecemos la posicion de la ventana
		//setBounds(100, 200, 500, 500);//Establecemos la posicion inicial y el tamaño
		setLocationRelativeTo(null);//Establesemos ls ventana al centro
		//setResizable(false);//Establecemos si la ventana puede cambiar de tamño
		setMinimumSize(new Dimension(200,200));//Establecemos el tamaño minimo de la ventana
		//this.getContentPane().setBackground(Color.BLUE);//Establecemos el color de la ventana
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void iniciarComponentes() {
		JPanel panel = new JPanel();//Creacion de un panel
		//panel.setBackground(Color.GREEN);//Establecemos el color del panel;
		panel.setLayout(null);//Desacrivamos el Diseño
		this.getContentPane().add(panel);//Agregamos el panel a la ventana
		
		//Etiqueta 1 - etiqueta tipo Texto
		//JLabel etiqueta =new JLabel("Hola",SwingConstants.CENTER);//Creamo una etiqueta
		//Otra forma
		JLabel etiqueta =new JLabel();//Creamos la etiqueta
		etiqueta.setText("Mundial 2018");//Establecemos el texto de la etiquet
		etiqueta.setBounds(85, 10, 300, 80);//(posicion,posicio,ancho,alto)
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecemos la alinaiación horizontal en la etique
		etiqueta.setForeground(Color.BLACK);//Establecemos el color de la letra de nuesta etiqueta
		//etiqueta.setOpaque(true);//Estblecemos pintar el fondo de la etiqueta
		//etiqueta.setBackground(Color.BLACK);//ambiamo es color de fondo de nuestra etiqueta
		etiqueta.setFont(new Font("cooper black",0,40));//Establecemos la furntr del texto Font. establecemos el tipo de letra PLAIN es arial en la pocicion de Font.PLAIN se pueden poner los estilos de forma numerica
		panel.add(etiqueta);//Agregamos la etiquetla al panel
		
		
		
		//Etiqueta - etiqueta tipo imagen
		//ImageIcon imagen = new ImageIcon("mundial_2018.jpg");
		//JLabel etiqueta2 = new JLabel(imagen);
		//Otra forma
		//JLabel etiqueta2 = new JLabel();
		//etiqueta2.setIcon(new ImageIcon("mundial_2018.jpg"));
		
		JLabel etiqueta2 = new JLabel(new ImageIcon("mundial_2018.jpg"));
		etiqueta2.setBounds(10, 80, 458, 458);//setBounds(eje x, eje y, WIDTH, HEIGHT);
		panel.add(etiqueta2);
	}
	

}
