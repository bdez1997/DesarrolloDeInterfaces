package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import controller.WindowCtrl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;



public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private byte bPalabra=controller.WindowCtrl.generarNum();

	
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
		
		JLabel lblNewLabel = new JLabel("HELLO");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(135, 31, 175, 59);
		contentPane.add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				textField1.setText(model.Languages.sEsp.get(bPalabra));
			}
		});
		
		textField1.setBounds(62, 136, 187, 20);
		contentPane.add(textField1);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta=textField2.getText();
				
				if(respuesta.equalsIgnoreCase(model.Languages.sEng.get(bPalabra))) {
					textField2.setText("Correcto");
				}
				
				
			}
		});
		btnPlay.setBounds(274, 135, 77, 23);
		contentPane.add(btnPlay); 
		
		textField2 = new JTextField();
		textField2.setBounds(62, 203, 187, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
	}
}
