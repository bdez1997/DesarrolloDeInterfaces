package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Ctrl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;

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
		JList listaDeNumeros = new JList();
		listaDeNumeros.setBounds(26, 11, 148, 185);
		
		contentPane.add(listaDeNumeros);
		
		JLabel lblNumTeléfono = new JLabel("");
		lblNumTeléfono.setBounds(204, 11, 151, 49);
		contentPane.add(lblNumTeléfono);
		
		JButton btnNewButton = new JButton("Abrir Agenda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Ctrl.abrirFichero();
			}
		});
		btnNewButton.setBounds(36, 215, 136, 23);
		contentPane.add(btnNewButton);
	}
}
