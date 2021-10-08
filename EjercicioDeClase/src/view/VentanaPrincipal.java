package view;

import javax.swing.*;

import controller.EjercicioCtrl;

import java.awt.*;
import java.awt.event.*;



public class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
		iniciarVentana();
	}

	public void iniciarVentana() {
		setTitle("Ventana");
		setBounds(100,100,500,300);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				EjercicioCtrl.finalizarApp();
			}
		});
		
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		
		JMenuBar barr = new JMenuBar();
		JMenu Editor = new JMenu("Editor");
		JMenuItem Colores=new JMenuItem("Colores");
		JMenuItem salir=new JMenuItem("Salir");
		
		
		salir.addActionListener(new ActionListener(){
			int iOpcion;
			public void actionPerformed(ActionEvent e) {
				iOpcion=JOptionPane.showConfirmDialog(null,"¿Seguro que quieres salir?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				controller.EjercicioCtrl.finalizarApp();
			}
		});		
		
		Editor.add(Colores);
		Editor.add(salir);
		barr.add(Editor);
		setJMenuBar(barr);
		
	}
	
}

