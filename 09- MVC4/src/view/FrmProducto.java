package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmProducto extends JDialog {
	public FrmProducto() {
		setTitle("Gestión de producto");
		setModal(true);
		setBounds(100, 100, 400, 200);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		crearComponentes();
		setVisible(true);
		
			
		
	}

	private void crearComponentes() {
		JButton btnCrear=new JButton("Crear");
		btnCrear.setBounds(10,50,80,20);
		add(btnCrear);
	}
}

