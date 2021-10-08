package unico;

import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class MiVentana extends java.awt.Frame {

	// Colores
	final Color CLR_BG_VENTANA = (Color.orange);
	final Color CLR_FG_USUARIO = Color.yellow;
	final Color CLR_FG_PASSWORD = Color.white;

	// Fuentes

	final Font FNT_LBL_NORMAL = new Font("Arial", Font.PLAIN, 12);
	final Font FNT_LBL_RESALTADO = new Font("Arial", Font.BOLD, 16);
	final Font FNT_LBL_TITULO = new Font("Arial", Font.BOLD, 20);

	public static void main(String[] args) {

		MiVentana myWindow = new MiVentana();
		myWindow.iniciarVentana("Creando Componentes");
	}

	private void iniciarVentana(String titulo) {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}

		});

		setTitle(titulo);
		setBounds(100, 100, 600, 400);
		setBackground(CLR_BG_VENTANA);
		// DISTINTOS TIPOS DE LAYOUT
		// setLayout(new FlowLayout());
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		iniciarComponentes();
		setVisible(true);

	}

	private void iniciarComponentes() {
		/*
		 * Button btnAceptar=new Button(); btnAceptar.setLabel("Aceptar");
		 */

		MenuBar barr = new MenuBar();

		setMenuBar(barr);
		Menu mnuArchivo = new Menu("Archivo");
		Menu mnuEditar = new Menu("Editar");
		Menu mnuExportar = new Menu("Exportar");
		Menu mnuAyuda = new Menu("Ayuda");
		Menu mnuConvertir = new Menu("Convertir");
		Menu mnuImagen=new Menu("Imagen");
		Menu mnuBd=new Menu("BD");
		
		MenuItem mniJpg = new MenuItem("JPG");
		MenuItem mniPng = new MenuItem("PNG");
		MenuItem mniBmp = new MenuItem("BMP");
		
		MenuItem mniManual = new MenuItem("Manual");
		MenuItem mniAcercade = new MenuItem("Acerca de");

		MenuItem mniAbrir = new MenuItem("Abrir");
		MenuItem mniGuardar = new MenuItem("Guardar");
		MenuItem mniGuardarComo = new MenuItem("Guardar como");
		MenuItem mniSalir = new MenuItem("Salir");

		MenuItem mniWord = new MenuItem("Word");
		MenuItem mniPdf = new MenuItem("PDF");
		MenuItem mniTexto = new MenuItem("Texto");
		
		MenuItem mniOracle = new MenuItem("Oracle");
		MenuItem mniMySql=new MenuItem("MySQL");
		MenuItem mniAcces = new MenuItem("Acces");
		
		MenuItem mniCopiar = new MenuItem("Copiar");
		MenuItem mniCortar = new MenuItem("Cortar");
		MenuItem mniPegar = new MenuItem("Pegar");

		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);
		mnuArchivo.add(mnuExportar);
		mnuArchivo.add(mniSalir);

		mnuExportar.add(mniWord);
		mnuExportar.add(mniPdf);
		mnuExportar.add(mniTexto);

		mnuAyuda.add(mniManual);
		mnuAyuda.add(mniAcercade);
		
		mnuConvertir.add(mnuImagen);
		mnuImagen.add(mniJpg);
		mnuImagen.add(mniPng);
		mnuImagen.add(mniBmp);
		mnuConvertir.add(mnuBd);
		mnuBd.add(mniOracle);
		mnuBd.add(mniMySql);
		mnuBd.add(mniAcces);
		
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniCortar);
		mnuEditar.add(mniPegar);
		
		

		barr.add(mnuArchivo);
		barr.add(mnuEditar);
		barr.add(mnuAyuda);
		barr.add(mnuConvertir);

		/*
		 * add(btn1,BorderLayout.NORTH); add(btn2,BorderLayout.SOUTH);
		 * add(btn3,BorderLayout.EAST); add(btn4,BorderLayout.WEST);
		 * add(btn5,BorderLayout.CENTER);
		 */

		/*
		 * Button btnSevilla=new Button("Sevilla"); Button btnNo=new Button("No");
		 * Button btnSi=new Button("Sí"); Button btnAndalucia=new Button("Andalucía");
		 * 
		 * btnSevilla.setBounds(10,40,80,40); btnNo.setBounds(95,40,40,40);
		 * btnSi.setBounds(10,85,40,40); btnAndalucia.setBounds(55,85,80,40);
		 * 
		 * add(btnSevilla); add(btnNo); add(btnSi); add(btnAndalucia);
		 */
	}

}
