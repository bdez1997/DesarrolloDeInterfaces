package unico;

import java.awt.*;

public class Miventana extends java.awt.Frame {
	 public  Miventana() {
		 
		 Color fondoVentana=new Color(249,231,159);
		 Color TextoError=Color.red;
		 Color TextoNormal=Color.gray;
		 
		 setTitle("Ejemplo por herencia");
		 Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		 
		 int ancho=600;
		 int alto=400;
		 
		 int x=(screenSize.width-ancho)/2;
		 int y=(screenSize.height-alto)/2;
		 
		 setBounds(x,y,ancho,alto);
		 setBackground(java.awt.Color.orange);
		 //setForeground();
		 
		 setVisible(true);

	 }

}
