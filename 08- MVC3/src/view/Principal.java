package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import controller.CtrlDoble;

public class Principal extends java.awt.Frame {
	
	public Principal() {
		iniciarVentana("Ficha Alumno");
	}

	private void iniciarVentana(String titulo) {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				controller.CtrlDoble.finalizarApp();
			}

		});
		
		setIconImage(Toolkit.getDefaultToolkit().createImage("Icon.png"));
		
		setTitle(titulo);
		setBounds(100, 100, 400, 400);
		setBackground(view.Theme.CLR_BG_VENTANA);
		// DISTINTOS TIPOS DE LAYOUT
		// setLayout(new FlowLayout());
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		iniciarComponentes();
		setVisible(true);

	}

	private void iniciarComponentes() {
		

		/*MenuBar barr = new MenuBar();

		setMenuBar(barr);
		
		TextArea txtBlocDeNotas = new TextArea();
		
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
		mnuArchivo.addSeparator();
	
		mnuArchivo.add(mniSalir);
		
		
		mniAbrir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.pulsarAbrir();
			}
		});
		
		mniGuardar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.pulsarGuardar();
			}
		});
		
		

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
		
		
		add(txtBlocDeNotas,BorderLayout.CENTER);
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
		 * Button btnSi=new Button("S?"); Button btnAndalucia=new Button("Andaluc?a");
		 * 
		 * btnSevilla.setBounds(10,40,80,40); btnNo.setBounds(95,40,40,40);
		 * btnSi.setBounds(10,85,40,40); btnAndalucia.setBounds(55,85,80,40);
		 * 
		 * add(btnSevilla); add(btnNo); add(btnSi); add(btnAndalucia);
		 */
		
		
		/*Label lblPago=new Label("Forma de pago");
		CheckboxGroup grpFormaPago = new CheckboxGroup();

		Checkbox opcEfectivo = new Checkbox("Efectivo",true,grpFormaPago);
		Checkbox opcTarjeta = new Checkbox("Tarjeta",false,grpFormaPago);
		Checkbox opcBizzum = new Checkbox("Bizzum",false,grpFormaPago);
		
		
		
		
		
		lblPago.setBounds(50,80,90,20);
		
		
		opcEfectivo.setBounds(50,120,80,20);
		opcTarjeta.setBounds(50,140,80,20);
		opcBizzum.setBounds(50,160,80,20);
		
		add(lblPago);
		add(opcEfectivo);
		add(opcTarjeta);
		add(opcBizzum);*/
		
		JPanel pnlLogin = new JPanel(null);
		JLabel lblNombre =new JLabel("Nombre:");
		JLabel lblApellidos=new JLabel("Apellidos:");
		JTextField txtNombre=new JTextField(70);
		JTextField txtApellidos=new JTextField(70);
		
		JPanel pnlCurso =new JPanel(null);
		JLabel lblCuso=new JLabel("Curso");
		ButtonGroup  grpCurso = new ButtonGroup ();
		JCheckBox opcDam = new JCheckBox();
		JCheckBox opcDaw = new JCheckBox();
		JCheckBox opcAsir = new JCheckBox();
		
		opcDam.setText("DAM");
		opcDam.setSelected(true);
		opcDaw.setText("DAW");
		opcAsir.setText("ASIR");
		grpCurso.add(opcDam);
		grpCurso.add(opcDaw);
		
		
		JPanel pnlTurno =new JPanel(null);
		JLabel lblTurno=new JLabel("Turno");
		ButtonGroup grpTurno = new ButtonGroup ();
		JCheckBox opcMa?ana = new JCheckBox();
		JCheckBox opcTarde = new JCheckBox();
		
		opcMa?ana.setSelected(true);
		opcMa?ana.setText("Ma?ana");
		opcTarde.setText("Tarde");
		grpTurno.add(opcMa?ana);
		grpTurno.add(opcTarde);
		
		
		
		Checkbox opcResponable= new Checkbox("Es responsable econ?mico",true);
		
		opcResponable.setBounds(30,320,200,30);
		
		
		add(pnlLogin);		
		pnlLogin.setBounds(20,50,250,100);
		lblNombre.setBounds(10,30,50,30);
		txtNombre.setBounds(80,35,120,20);
		lblApellidos.setBounds(10,70,60,30);
		txtApellidos.setBounds(80,75,120,20);
		
		pnlLogin.add(lblNombre);
		pnlLogin.add(txtNombre);
		pnlLogin.add(lblApellidos);
		pnlLogin.add(txtApellidos);
		
		add(pnlCurso);
		pnlCurso.setBounds(20,170,150,100);
		lblCuso.setBounds(10,10,40,20);
		opcDam.setBounds(20,30,60,20);
		opcDaw.setBounds(20,50,60,20);
		opcAsir.setBounds(20,70,60,20);
		
		pnlCurso.add(lblCuso);
		pnlCurso.add(opcDam);
		pnlCurso.add(opcDaw);
		pnlCurso.add(opcAsir);
		
		add(pnlTurno);
		lblTurno.setBounds(10,10,40,20);
		pnlTurno.setBounds(200,170,180,100);
		opcMa?ana.setBounds(20,30,70,20);
		opcTarde.setBounds(20,50,70,20);
		
		pnlTurno.add(lblTurno);
		pnlTurno.add(opcMa?ana);
		pnlTurno.add(opcTarde);
		
		add(opcResponable);
		
		
		
		
	}
}
