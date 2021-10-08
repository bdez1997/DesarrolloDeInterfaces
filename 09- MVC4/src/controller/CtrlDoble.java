package controller;

import java.awt.Color;

import javax.swing.*;

import view.Principal;
import view.Theme;

public class CtrlDoble {

	public static void finalizarApp() {
		int iOpcionSeleccionada=JOptionPane.showConfirmDialog(null,"¿Seguro qué quieres salir?","Ventana de advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		if (iOpcionSeleccionada==0) {
			System.exit(0);

		}
		
	}
	public static void pulsarAbrir() {
		System.out.println("Has pulsado abrir");
	}
	public static void pulsarGuardar() {
		System.out.println("Has pulsado Guardar");
	}
	public static void cambiarBackground() {
		//view.Principal.setBackground(view.Theme.CLR_BG[view.Principal.lstFondo.getSelectedIndex()]));
	
	}
}
