package model;

public class Personas {
	private int NumTelefono;
	private String sNombre;
	
	public Personas(String sNombre,int iNumTelefono) {
		setsNombre(sNombre);
		setNumTelefono(iNumTelefono);
		
	}
	
	
	public int getNumTelefono() {
		return NumTelefono;
	}
	public void setNumTelefono(int numTelefono) {
		this.NumTelefono = numTelefono;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}


	@Override
	public String toString() {
		String sResultado="";
		sResultado = "Nombre "+getsNombre();
		sResultado +=" Número de tlfno "+ getNumTelefono();
		
		return sResultado;
	}
	
	
	
	
}
