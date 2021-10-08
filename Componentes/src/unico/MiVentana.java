package unico;

import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class MiVentana extends java.awt.Frame {

	// Colores
	final Color CLR_BG_VENTANA = new Color(0, 155, 0);
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
		setLayout(null);
		iniciarComponentes();
		setVisible(true);

	}

	private void iniciarTextField() {

	}

	private void iniciarComponentes() {

		/*
		 * Button btnAceptar=new Button(); btnAceptar.setLabel("Aceptar");
		 */
		TextField txtUserName = new TextField("Medac");

		
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");

		Label lblUsuario = new Label("Usuario");
		Label lblContrasena = new Label("Contraseña");

		// añadir size and location

		btnAceptar.setBounds(10, 40, 80, 40);
		btnCancelar.setBounds(95, 40, 80, 40);

		lblUsuario.setBounds(10, 85, 300, 20);
		lblUsuario.setForeground(CLR_FG_USUARIO);

		lblContrasena.setBounds(10, 110, 300, 20);
		lblContrasena.setForeground(CLR_FG_PASSWORD);
		lblContrasena.setFont(FNT_LBL_RESALTADO);


		txtUserName.setBounds(400, 400, 600, 400);
		txtUserName.setBackground(Color.gray);

		// agregar boton al Frame
		add(btnAceptar);
		add(btnCancelar);
		add(lblUsuario);
		add(lblContrasena);
		add(txtUserName);

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
