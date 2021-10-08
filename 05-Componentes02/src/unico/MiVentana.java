package unico;

import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class MiVentana extends java.awt.Frame {

	// Colores
	final Color CLR_BG_VENTANA = (Color.orange);
	final Color CLR_FG_USUARIO = Color.yellow;
	final Color CLR_FG_PASSWORD = Color.white;

	// Fuentes

	final Font FNT_LBL_NORMAL = new Font("Arial", Font.PLAIN, 12);
	final Font FNT_LBL_RESALTADO = new Font("Arial", Font.BOLD, 16);
	final Font FNT_LBL_TITULO = new Font("Arial", Font.BOLD, 20);

	public static void main(String[] args) {

		MiVentana myWindow = new MiVentana();
		myWindow.iniciarVentana("Creando Componentes");
	}

	private void iniciarVentana(String titulo) {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}

		});

		setTitle(titulo);
		setBounds(100, 100, 600, 400);
		setBackground(CLR_BG_VENTANA);
		// DISTINTOS TIPOS DE LAYOUT
		// setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		// setLayout(new GridLayout(2,3));
		iniciarComponentes();
		setVisible(true);

	}

	private void iniciarComponentes() {
		/*
		 * Button btnAceptar=new Button(); btnAceptar.setLabel("Aceptar");
		 */
		Button btn1 = new Button("Aceptar");
		Label lbl1 = new Label("Usuario");
		Label lbl2 = new Label("Contraseña");
		TextField txt1 = new  TextField();
		TextField txt2=new TextField();
		
		

		/*
		 * add(btn1,BorderLayout.NORTH); add(btn2,BorderLayout.SOUTH);
		 * add(btn3,BorderLayout.EAST); add(btn4,BorderLayout.WEST);
		 * add(btn5,BorderLayout.CENTER);
		 */

		Panel panBotones = new Panel();
		panBotones.setLayout(new BorderLayout());

		Panel panOperaciones = new Panel();
		panOperaciones.setLayout(new GridLayout(2, 2));

		add(panOperaciones, BorderLayout.CENTER);
		//add(panBotones, FlowLayout.SOUTH);
		

		panOperaciones.add(lbl1);
		panOperaciones.add(txt1);
		
		panOperaciones.add(lbl2);
		panOperaciones.add(txt2);

		/*
		 * Button btnSevilla=new Button("Sevilla"); Button btnNo=new Button("No");
		 * Button btnSi=new Button("Sí"); Button btnAndalucia=new Button("Andalucía");
		 * 
		 * btnSevilla.setBounds(10,40,80,40); btnNo.setBounds(95,40,40,40);
		 * btnSi.setBounds(10,85,40,40); btnAndalucia.setBounds(55,85,80,40);
		 * 
		 * add(btnSevilla); add(btnNo); add(btnSi); add(btnAndalucia);
		 */
	}

}
