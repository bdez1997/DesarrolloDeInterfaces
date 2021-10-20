package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Fuente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		setIconImage(Toolkit.getDefaultToolkit().createImage("RGB.jpg"));
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnuArchivo = new JMenu("Archivo");
		menuBar.add(mnuArchivo);
		
		JMenuItem mnItmNuevo = new JMenuItem("Nuevo");
		mnuArchivo.add(mnItmNuevo);
		
		JMenuItem mnuItmAbrir = new JMenuItem("Abrir");
		mnuArchivo.add(mnuItmAbrir);
		
		JMenuItem mnuItmGuardar = new JMenuItem("Guardar");
		mnuArchivo.add(mnuItmGuardar);
		
		JMenuItem mntItmGuardarComo = new JMenuItem("Guardar Como");
		mnuArchivo.add(mntItmGuardarComo);
		
		JMenuItem mnuItmSalir = new JMenuItem("Salir");
		mnuArchivo.addSeparator();
		mnuArchivo.add(mnuItmSalir);
		
		JMenu mnuAyuda = new JMenu("Ayuda");
		menuBar.add(mnuAyuda);
		
		JMenuItem mnuItmManual = new JMenuItem("Manual");
		mnuItmManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Manual();
			}
		});
		mnuAyuda.add(mnuItmManual);
		
		JMenuItem mnuItmAcercaDe = new JMenuItem("Acerca de");
		mnuItmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AcercaDe();
			}
		});
		mnuAyuda.add(mnuItmAcercaDe);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextArea txtAreaBlocDeNotas = new JTextArea();
		getContentPane().add(txtAreaBlocDeNotas, BorderLayout.CENTER);
		
		
		
		
		
	}
}
