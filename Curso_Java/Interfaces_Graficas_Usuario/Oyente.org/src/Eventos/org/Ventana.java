package Eventos.org;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
	private JPanel panel;
	private JLabel saludo;
	private JTextField cajaTexto;
	private JTextArea areaTexto;
	private JButton boton;
	
	
	public Ventana() {
		setBounds(50,50,500,500);//Estblecemos el tamño de la ventana
		setTitle("Eventos");//Establecemos el titulo de la ventana
				
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void iniciarComponentes() {
		colocarPanel();
		//colocarEtiqueta();
		//colocarCajaDeTexto();
		colocarAreaTexto();
		colocarBoton();
	}
	
	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		
		eventoDeMovimientoDeRaton();
	}
	
	private void colocarEtiqueta() {
		JLabel etiqueta = new JLabel("Ingrese su nombre: ");
		etiqueta.setBounds(30, 10, 200, 30);
		etiqueta.setFont(new Font("cooper black",0,18));
		panel.add(etiqueta);
		
	}
	
	private void colocarCajaDeTexto() {
		cajaTexto = new JTextField();
		cajaTexto.setBounds(30, 50, 300, 30);
		panel.add(cajaTexto);
	}
	
	private void colocarAreaTexto() {
		areaTexto = new JTextArea();
		areaTexto.setBounds(20,20,200,300);
		panel.add(areaTexto);
		
		//otrometodo mas corto de barras de desplazamiento
		JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		barrasDesplazamiento.setBounds(20, 20, 200, 300);
		panel.add(barrasDesplazamiento);
	}
	
	private void colocarBoton() {
		boton=new JButton("¡Pulsa aquí!");
		boton.setBounds(150, 350, 150, 40);
		boton.setFont(new Font("arial",0,15));
		panel.add(boton);
		
		//eventoOyenteDeAccion();
		//eventoOyenteDeRaton();
	}
	
	
	private void eventoOyenteDeAccion() {		
		//Agregando Evento tipo ActionListener
		ActionListener oyenteDeAccion = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saludo.setText("Hola "+cajaTexto.getText());
				
			}
		};
		boton.addActionListener(oyenteDeAccion);

	}

	private void eventoOyenteDeRaton() {
		//Agergando oyente de Raton - MouseListener 
		MouseListener oyenteDeRaton = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//areaTexto.append("mouseReleased\n");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//areaTexto.append("mousePressed\n");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				//areaTexto.append("mouseExited\n");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				//areaTexto.append("mouseEntered\n");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.isAltDown()) {
					areaTexto.append("Alt\n");
				}else if(e.isControlDown()) {
					areaTexto.append("Control\n");
				}else if(e.isShiftDown()) {
					areaTexto.append("Shift\n");
				}else if(e.isMetaDown()) {
					areaTexto.append("isMetaDawn\n");
				}else {
					areaTexto.append("Click Izquierdo\n");
				}
				
				if(e.getClickCount()==2) {
					areaTexto.append("Doble click\n");
				}
			}
		};
		
		boton.addMouseListener(oyenteDeRaton);
	}

	private void eventoDeMovimientoDeRaton() {
		MouseMotionListener oyenteMovimintoRaton = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				areaTexto.append("mouseMoved\n");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				areaTexto.append("mouseDragged\n");
			}
		};
		panel.addMouseMotionListener(oyenteMovimintoRaton);
	}
}
