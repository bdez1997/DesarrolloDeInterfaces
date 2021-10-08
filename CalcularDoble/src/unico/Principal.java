package unico;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends java.awt.Frame {
	final Color CLR_ERROR = new Color(198, 0, 0);

	public static void main(String[] args) {
		Principal priCalculo = new Principal();
		priCalculo.iniciarVentana("Calculadora del doble");

	}

	private void iniciarVentana(String titulo) {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
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

		Label lblNumero = new Label("Número");
		Label lblInstruccion = new Label("Pulse el botón tras introducir el número");

		Button btnCalcular = new Button("Calcular");
		TextField txtPedirNumero = new TextField(10);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iNumero;
				String sTexto = txtPedirNumero.getText();
				if (sTexto.length() == 0) {
					lblInstruccion.setForeground(CLR_ERROR);
					lblInstruccion.setText("Debes introducir un número");

				} else {
					try {

						iNumero = Integer.parseInt(sTexto);
						iNumero = iNumero * 2;
						sTexto = "" + iNumero;
						txtPedirNumero.setText(sTexto);
					} catch (Exception e2) {
						lblInstruccion.setForeground(CLR_ERROR);
						lblInstruccion.setText("ERROR");
					}

				}
			}

		});

		lblNumero.setBounds(140, 140, 80, 20);
		lblNumero.setBackground(Color.white);
		lblInstruccion.setBounds(140, 210, 230, 20);
		lblInstruccion.setAlignment(Label.CENTER);
		txtPedirNumero.setBounds(225, 140, 175, 20);
		btnCalcular.setBounds(180, 165, 80, 40);

		add(lblNumero);
		add(btnCalcular);
		add(txtPedirNumero);
		add(lblInstruccion);

	}

}
