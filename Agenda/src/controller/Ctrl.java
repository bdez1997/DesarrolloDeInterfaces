package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.Personas;
import view.Principal;

public class Ctrl {

	public static ArrayList<Personas> listaContactos ;
	public static File fileName;

	public static void init() {

		new view.Principal();
	}

	public static void abrirFichero() {
		JFileChooser seleccionarFch = new JFileChooser();
		int iFichero;
		String fichero = null;
		seleccionarFch.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Selector de imágenes", "jpg", "png", "bmp",
				"gif", "cr2");
		FileNameExtensionFilter numFilter = new FileNameExtensionFilter("Selector de ficheros", "txt");

		seleccionarFch.setFileFilter(imgFilter);
		seleccionarFch.setFileFilter(numFilter);
		iFichero = seleccionarFch.showOpenDialog(null);

		if (iFichero != JFileChooser.CANCEL_OPTION) {
			fileName = seleccionarFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				System.out.println(fileName.getAbsolutePath());
				listaContactos=EscribirEnPersona();
				meterNombres();
				
			}

		}

	}

	public static ArrayList<Personas> EscribirEnPersona() {
		ArrayList<Personas>personita=new ArrayList<Personas>();
		String sNombre;
		String sNumTelefono;
		try {

			FileReader fch1 = new FileReader(fileName);
			BufferedReader bfLectura = new BufferedReader(fch1);
			String sSeparador = "#";
			String sLinea = bfLectura.readLine();

			while (sLinea != null) {
				StringTokenizer st = new StringTokenizer(sLinea, sSeparador);

				sNombre = st.nextToken();

				sNumTelefono = st.nextToken();
				sLinea = bfLectura.readLine();

				personita.add(new Personas(sNombre, sNumTelefono));

			}
			fch1.close();
			bfLectura.close();
			System.out.println(listaContactos);
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			System.out.println("Error al acceder al fichero");
		}
		return personita;

	}

	public static void meterNombres() {

		DefaultListModel<String> sModel = new DefaultListModel<String>();
		for (int i = 0; i < listaContactos.size(); i++) {
			sModel.addElement(listaContactos.get(i).getsNombre());
		}
		view.Principal.listaDeNumeros.setModel(sModel);

	}

}
