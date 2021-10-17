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

public class Principal extends JFrame {

	private JPanel contentPane;
	public static JList listaDeNumeros;

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

		lblNumTeléfono.setBounds(204, 11, 151, 49);
		contentPane.add(lblNumTeléfono);

		btnNewButton.setBounds(36, 215, 136, 23);
		contentPane.add(btnNewButton);
	}
}
