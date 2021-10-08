package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import controller.CtrlDoble;

public class Principal extends java.awt.Frame {

	public static Label lblNumero;
	public static Label lblInstruccion;
	public static Button btnCalcular;
	public static Button btnCalcularTrilple;
	public static Button btnCalcularMitad;
	public static TextField txtPedirNumero;

	public Principal() {
		iniciarVentana("Calculadora del doble");

	}

	private void iniciarVentana(String titulo) {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				CtrlDoble.finalizarApp();
			}

		});
		setTitle(titulo);
		setBounds(100, 100, 500, 300);
		setBackground(Color.orange);
		setLayout(null);
		iniciarComponentes();

		setVisible(true);
	}

	private void iniciarComponentes() {

		lblNumero = new Label("Número");
		lblInstruccion = new Label("Pulse el botón tras introducir el número");

		lblNumero.setBounds(140, 140, 80, 20);
		lblNumero.setBackground(Color.white);

		lblInstruccion.setBounds(140, 210, 230, 20);
		lblInstruccion.setAlignment(Label.CENTER);

		txtPedirNumero = new TextField();
		txtPedirNumero.setBounds(225, 140, 175, 20);
		
		btnCalcular = new Button("Calcular");
		btnCalcular.setBounds(195, 180, 100, 30);

		btnCalcularTrilple = new Button("Calcula el triple");
		btnCalcularTrilple.setBounds(70, 180, 100, 30);
		
		btnCalcularMitad=new Button("Calcula la mitad");
		btnCalcularMitad.setBounds(320,180,100,30);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularDoble();
			}
		});

		btnCalcularTrilple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularTriple();
			}
		});
		
		btnCalcularMitad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularMitad();
			}
		});
		
		add(btnCalcularTrilple);
		add(btnCalcularMitad);
		add(lblNumero);
		add(btnCalcular);
		add(txtPedirNumero);
		add(lblInstruccion);

	}

}
