package unico;
import java.awt.Frame;

public class Principal {

	public static void main(String[] args) {
		
		/*Frame ventana = new Frame();
		Frame ventana = new Frame("Esta es mi primera ventana");

		ventana.setSize(600,400);
		ventana.setLocation(400,200);
		ventana.setBounds(400,200,600,400);
		ventana.setTitle("Esto es el título de mi ventana");
		ventana.setVisible(true);
		
		test1("PEPE",600,400);*/
		test2();
			
	}
	
	private static void test1(String titulo,int ancho,int alto) {
		Frame ventana=new Frame(titulo);
		
		ventana.setBounds(0,0,ancho,alto);
		ventana.setVisible(true);
	}
	private static void test2() {
		Miventana v = new Miventana();
	}

}
