package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JColorChooser;
import java.awt.Color;
import controller.WindowCtrl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblPalabraRandom;
	private JTextField textField2;
	private byte bPalabra = controller.WindowCtrl.generarNum();

	public FrmPrincipal() {
		setTitle("Idiomas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().createImage("earthIcon.png"));
		setBounds(100, 100, 455, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		crearComponentes();
		setVisible(true);

	}

	public void crearComponentes() {
		model.Languages.cargarLenguajes();

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(65, 30, 286, 82);
		contentPane.add(lblNewLabel);

		lblNewLabel.setText(model.Languages.sEsp.get(bPalabra));

		JLabel lblRespuesta = new JLabel();
		lblRespuesta.setBounds(58, 214, 189, 49);
		contentPane.add(lblRespuesta);

		JButton btnPlay = new JButton("PLAY");

		btnPlay.addActionListener(e -> {
			
		});
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta = textField2.getText();
				String RespuestaCorrecta = model.Languages.sEng.get(bPalabra);
				int iOption = 0;
				while (iOption == 0) {
					if (respuesta.equalsIgnoreCase(model.Languages.sEng.get(bPalabra))) {
						lblRespuesta.setForeground(Color.blue);
						lblRespuesta.setText("Correcto");
						iOption = JOptionPane.showConfirmDialog(null, "¿Quieres volver a realizarlo?", "¿Te atreves?",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (iOption == 0) {
							bPalabra = controller.WindowCtrl.generarNum();
						} else {
							System.exit(0);
						}
					} else {
						lblRespuesta.setForeground(Color.red);
						lblRespuesta.setText(RespuestaCorrecta);
						iOption = JOptionPane.showConfirmDialog(null, "¿Quieres volver a realizarlo?", "¿Te atreves?",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (iOption == 0) {
							bPalabra = controller.WindowCtrl.generarNum();
						} else {
							System.exit(0);
						}
					}
				}

			}
		});
		btnPlay.setBounds(274, 135, 77, 23);
		contentPane.add(btnPlay);

		textField2 = new JTextField();
		textField2.setBounds(58, 136, 187, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);

	}
}
