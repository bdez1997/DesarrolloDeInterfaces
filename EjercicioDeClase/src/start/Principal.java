package start;


public class Principal {

	public static void main(String[] args) {
		Principal app= new Principal();
		app.init();
	}

	private void init() {
		new view.VentanaPrincipal();
	}

}
