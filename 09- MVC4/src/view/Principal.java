package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controller.CtrlDoble;

public class Principal extends JFrame {
	public static List lstFondo = new List();
	public static List lstLetras = new List();
	public static Label lblFondo = new Label("Fondo: ");
	public static Label lblLetras = new Label("Letras: ");
	public static Label lblInstrucciones = new Label("Seleccione un color");
	
	public static JButton btnVentana=new JButton("Ventana");

	public Principal() {
		iniciarVentana();
	}

	private void iniciarVentana() {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				controller.CtrlDoble.finalizarApp();
			}

		});

		setIconImage(Toolkit.getDefaultToolkit().createImage("Icon.png"));

		setTitle("Combinando Colores");
		setBounds(100, 100, 400, 400);
		setBackground(view.Theme.CLR_BG_VENTANA);
		// DISTINTOS TIPOS DE LAYOUT
		// setLayout(new FlowLayout());
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		iniciarComponentes();
		setVisible(true);

	}

	private void iniciarComponentes() {
		
		//PARA MENSAJES : showMessageDialog
		//PARA INTRODUCIRR DATOS showInputDialog
		//PARA INTRODUCIR PREGUNTAS SI O NO JOptionPane.showConfirmDialog(null, "?Quiere comprar este objeto?","Confirmar cesta", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		btnVentana.setBounds(50, 100, 150, 30);
		btnVentana.addActionListener(e->{
			new FrmProducto();
			
			});
			
			
		
		add(btnVentana);
		//LISTAS SWING
		
		/*String[] misColores = {"Rojo","verde","Amarillo"};
		JComboBox lstColores = new JComboBox(misColores);
		lstColores.setEditable(true);
		lstColores.setBounds(70,80,75,20);
		add(lstColores);*/
		
		
		// Lista ya desplegada

		/*lstFondo.add("Rojo");
		lstFondo.add("Verde");
		lstFondo.add("Amarillo");
		lstFondo.add("Negro");

		lstLetras.add("Blanco");
		lstLetras.add("Azul");
		lstLetras.add("Negro");

		lblFondo.setBounds(50, 100, 50, 20);
		lstFondo.setBounds(50, 130, 80, 70);
		lblLetras.setBounds(250, 100, 50, 20);
		lstLetras.setBounds(250, 130, 80, 60);

		lstFondo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				setBackground(view.Theme.CLR_BG[lstFondo.getSelectedIndex()]);
				if (lstFondo.getSelectedIndex() != -1) {
					lblInstrucciones.setForeground(view.Theme.CLR_FOREGROUND[lstLetras.getSelectedIndex()]);
				}
			}
		});

		add(lblInstrucciones);
		add(lstFondo);
		add(lstLetras);
		add(lblFondo);
		add(lblLetras);*/

	}
}
