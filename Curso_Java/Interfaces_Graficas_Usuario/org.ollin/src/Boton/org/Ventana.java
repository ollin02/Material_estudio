package Boton.org;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	public JPanel panel;
	
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
		
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		//colocarcarBotonesActivacion();
		//colocarCajasTexto();
		//colocarAreasTexto();
		//colocarCasillasDeVerificacion();
		colocarListasDesplegables();
		
	}
	
	private void colocarPaneles() {
		panel = new JPanel();//Creacion de un panel
		//panel.setBackground(Color.GREEN);//Establecemos el color del panel;
		panel.setLayout(null);//Desacrivamos el Diseño
		this.getContentPane().add(panel);//Agregamos el panel a la ventana
	}
	
	private void colocarEtiquetas() {
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
		ImageIcon imagen =new ImageIcon("mundial_2018.jpg");
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setBounds(80, 90, 300, 300);//setBounds(eje x, eje y, WIDTH, HEIGHT);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//getScaledInstance(WIDTH, HEIGHT, DO_NOTHING_ON_CLOSE)escala el tamaño de la imagen
		panel.add(etiqueta2);

	}
	
	private void colocarBotones() {
		//Boton 1 - boton de texto
		JButton boton1= new JButton();
		boton1.setText("Click");//Establecemos untexto al boton
		boton1.setBounds(100, 100, 100, 40);
		boton1.setEnabled(true);//Establecemos el encendido del botón
		boton1.setMnemonic('a');//Establecemos alt + letra y se cliquea
		boton1.setForeground(Color.BLUE);//Estbalecemos el color de la letra
		boton1.setFont(new Font("cooper black",2,20));//Establecemos la fuente el color y el tamaño
		panel.add(boton1);
		
		//Boton 2 -boton de imagen
		JButton boton2 = new JButton();
		boton2.setBounds(100, 200, 100, 40);
		//boton2.setOpaque(true);
		ImageIcon clickAqui = new ImageIcon("boton.png");
		boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		//boton2.setBackground(Color.BLUE);//Establecemos el color de fondo del boton
		panel.add(boton2);
		
		//Boton 3 - boton de bordes
		JButton boton3 = new JButton();
		boton3.setBounds(100,300,110,50);
		boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, false));
		panel.add(boton3);
			
		
	}

	private void colocarRadioBotones() {
		JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);
		radioBoton1.setBounds(50, 100, 200, 50);
		radioBoton1.setEnabled(true);
		radioBoton1.setText("Programacion");
		radioBoton1.setFont(new Font("copper black",0,20));
		panel.add(radioBoton1);
		
		JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
		radioBoton2.setBounds(50, 150, 100, 50);
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
		radioBoton3.setBounds(50, 200, 100, 50);
		panel.add(radioBoton3);
		
		ButtonGroup grupoRadioBtotones = new ButtonGroup();
		grupoRadioBtotones.add(radioBoton1);
		grupoRadioBtotones.add(radioBoton2);
		grupoRadioBtotones.add(radioBoton3);
	}
	
	private void colocarcarBotonesActivacion() {
		JToggleButton botonActivacion1 = new JToggleButton("OPcion 1", true);
		botonActivacion1.setBounds(50, 100, 100, 40);
		panel.add(botonActivacion1);
		
		JToggleButton botonActivacion2 = new JToggleButton("OPcion 2", false);
		botonActivacion2.setBounds(50, 150, 100, 40);
		panel.add(botonActivacion2);
		
		JToggleButton botonActivacion3 = new JToggleButton("OPcion 3", false);
		botonActivacion3.setBounds(50, 200, 100, 40);
		panel.add(botonActivacion3);
		
		ButtonGroup grupobotonesAtivados = new ButtonGroup();
		grupobotonesAtivados.add(botonActivacion1);
		grupobotonesAtivados.add(botonActivacion2);
		grupobotonesAtivados.add(botonActivacion3);
	}
	
	private void colocarCajasTexto() {
		JTextField cajaTexto = new JTextField();{
			cajaTexto.setBounds(50, 50, 100, 30);
			cajaTexto.setText("Hola.........");
			
			System.out.println("Texto en la caja: "+ cajaTexto.getText());
			panel.add(cajaTexto);
				
		}
	}
	
	private void colocarAreasTexto() {
		JTextArea areaTexto1= new JTextArea();
		areaTexto1.setBounds(20, 20, 300, 200);
		areaTexto1.setText("Escriba el texto aquí...");
		areaTexto1.append("\nEscribe por aqui....");//Este metodo añade mas texto al aerea
		areaTexto1.setEditable(true);//Establecer editado con el area de texto
		
		System.out.println("El texto es: "+areaTexto1.getText());
		panel.add(areaTexto1);
		
		//Barras de desplazamiento
		//JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto1);
		//barrasDesplazamiento.setBounds(20, 20, 300, 200);
		//barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		//barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		//otrometodo mas corto de barras de desplazamiento
		JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		barrasDesplazamiento.setBounds(20, 20, 300, 200);
		panel.add(barrasDesplazamiento);
	}
	
	private void colocarCasillasDeVerificacion() {
		JCheckBox casillaVerificacion1 = new JCheckBox("Leche",true);
		casillaVerificacion1.setEnabled(true);
		casillaVerificacion1.setBounds(20, 20, 100, 40);
		panel.add(casillaVerificacion1);
		
		JCheckBox casillaVerificacion2 = new JCheckBox("Galletas");
		casillaVerificacion2.setBounds(20, 50, 100, 40);
		panel.add(casillaVerificacion2);
		
		JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt");
		casillaVerificacion3.setBounds(20, 80, 100, 40);
		panel.add(casillaVerificacion3);
		
		JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
		casillaVerificacion4.setBounds(20, 110, 100, 40);
		panel.add(casillaVerificacion4);
	}
	
	private void colocarListasDesplegables() {
		String [] paises = {"Perú","Colombi","Paraguay","Ecuador"};
		
		JComboBox listaDesplegable1 = new JComboBox(paises);
		listaDesplegable1.setBounds(20,20,100,30);
		
		listaDesplegable1.addItem("Argentina");//Añadir objetos a tu lista desplegable
		listaDesplegable1.setSelectedItem("Paraguay");//Seleccionar el primer objeto visto
		panel.add(listaDesplegable1);
	}
}
