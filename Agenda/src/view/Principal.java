package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

import controller.Ctrl;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JToolBar;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	public static JList listaDeNumeros;
	private JTextField txtNombre;
	private JTextField txtTelefono;

	public Principal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		crearComponentes();

		setVisible(true);
	}

	private void crearComponentes() {
		
		JLabel lblNumTeléfono = new JLabel("");

		JButton btnNewButton = new JButton("Abrir Agenda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.Ctrl.abrirFichero();
				
			}
		});

		listaDeNumeros = new JList();
		listaDeNumeros.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int iPosicion=0;
				iPosicion=listaDeNumeros.getSelectedIndex();
				lblNumTeléfono.setText(controller.Ctrl.listaContactos.get(iPosicion).getNumTelefono());
				
			}
		});

		listaDeNumeros.setBounds(26, 11, 148, 185);

		contentPane.add(listaDeNumeros);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(239, 51, 129, 23);
		txtNombre.setVisible(false);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(239, 85, 129, 23);
		txtTelefono.setVisible(false);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		
		lblNumTeléfono.setBounds(239, 11, 151, 29);
		contentPane.add(lblNumTeléfono);

		btnNewButton.setBounds(36, 215, 136, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iIndex=listaDeNumeros.getSelectedIndex();
				controller.Ctrl.listaContactos.get(iIndex).setsNombre(txtNombre.getText());
				controller.Ctrl.listaContactos.get(iIndex).setsNombre(txtTelefono.getText());
				
			}
		});
		btnGuardar.setVisible(false);
		btnGuardar.setBounds(239, 140, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iIndex=listaDeNumeros.getSelectedIndex();
				btnGuardar.setVisible(true);
				txtNombre.setText(Ctrl.listaContactos.get(iIndex).getsNombre());
				txtTelefono.setText(Ctrl.listaContactos.get(iIndex).getNumTelefono());
				txtNombre.setVisible(true);
				txtTelefono.setVisible(true);
							
			}
		});
		
		
		btnEditar.setBounds(239, 174, 89, 23);
		contentPane.add(btnEditar);
		
		
		
		
		
	}
}
