package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class AcercaDe extends JDialog {

	private JPanel contentPane;

	
	
	public AcercaDe() {
		setTitle("Acerca de");
		
		setBounds(100, 100, 450, 300);
		setModal(true);
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("RGBAcercaDe.jpg"));
		lblNewLabel.setBounds(10, 11, 102, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblTextoAcercaDe = new JLabel("");
		lblTextoAcercaDe.setBounds(153, 11, 180, 204);
		contentPane.add(lblTextoAcercaDe);
		
		
	}
}
