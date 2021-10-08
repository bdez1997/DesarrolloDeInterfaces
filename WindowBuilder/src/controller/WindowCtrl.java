package controller;

public class WindowCtrl {
	
	public  static void init() {
		model.Languages.cargarLenguajes();
		
		new view.FrmPrincipal();
	}
	public static byte generarNum() {
		byte iNumero=(byte) (Math.random()*10);
		return iNumero;
	}
}
