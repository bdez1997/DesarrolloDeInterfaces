package controller;

import javax.swing.text.View;

public class CtrlDoble {

	public static void finalizarApp() {
		System.exit(0);
	}
	public static void calcularTriple() {
		int iNumero;
		String sTexto = view.Principal.txtPedirNumero.getText();

		if (sTexto.length() == 0) {
			view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
			view.Principal.lblInstruccion.setText("Debes introducir un número");

		} else {
			try {

				iNumero = Integer.parseInt(sTexto);
				iNumero = iNumero * 3;
				sTexto = "" + iNumero;
				view.Principal.txtPedirNumero.setText(sTexto);
			} catch (Exception e2) {
				view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
				view.Principal.lblInstruccion.setText("ERROR");
			}
		}
		
	}
	public static void calcularDoble() {
		int iNumero;
		String sTexto = view.Principal.txtPedirNumero.getText();

		if (sTexto.length() == 0) {
			view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
			view.Principal.lblInstruccion.setText("Debes introducir un número");

		} else {
			try {

				iNumero = Integer.parseInt(sTexto);
				iNumero = iNumero * 2;
				sTexto = "" + iNumero;
				view.Principal.txtPedirNumero.setText(sTexto);
			} catch (Exception e2) {
				view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
				view.Principal.lblInstruccion.setText("ERROR");
			}
		}
	}
	public static void calcularMitad() {
		float iNumero;
		String sTexto = view.Principal.txtPedirNumero.getText();

		if (sTexto.length() == 0) {
			view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
			view.Principal.lblInstruccion.setText("Debes introducir un número");

		} else {
			try {

				iNumero = Float.parseFloat(sTexto);
				iNumero = iNumero / 2;
				sTexto = "" + iNumero;
				view.Principal.txtPedirNumero.setText(sTexto);
			} catch (Exception e2) {
				view.Principal.lblInstruccion.setForeground(view.Theme.CLR_ERROR);
				view.Principal.lblInstruccion.setText("ERROR");
			}
		}
	}
}
