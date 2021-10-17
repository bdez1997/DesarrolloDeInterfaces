package model;

public class Personas {
	private String NumTelefono;
	private String sNombre;

	public Personas(String sNombre, String iNumTelefono) {
		setsNombre(sNombre);
		setNumTelefono(iNumTelefono);

	}

	public String getNumTelefono() {
		return NumTelefono;
	}

	public void setNumTelefono(String numTelefono) {
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
		String sResultado = "";
		sResultado = "Nombre " + getsNombre();
		sResultado += " Número de tlfno " + getNumTelefono();

		return sResultado;
	}

}
