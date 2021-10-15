package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.Personas;
import view.Principal;

public class Ctrl {
	
	public static void init() {
		File fchContacts = new File("AgendaDeContactos.txt");
		ArrayList<Personas>listaContactos =EscribirEnPersona(fchContacts);
		listaContactos.forEach(s->System.out.println(s));
		new view.Principal();
		
	}

	public static void abrirFichero() {
		JFileChooser seleccionarFch = new JFileChooser();
		int iFichero;
		seleccionarFch.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Selector de imágenes", "jpg", "png", "bmp",
				"gif", "cr2");
		FileNameExtensionFilter numFilter = new FileNameExtensionFilter("Selector de ficheros", "txt");

		seleccionarFch.setFileFilter(imgFilter);
		seleccionarFch.setFileFilter(numFilter);
		iFichero = seleccionarFch.showOpenDialog(null);

		if (iFichero != JFileChooser.CANCEL_OPTION) {
			File fileName = seleccionarFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				System.out.println(fileName.getAbsolutePath());

			}

		}

	}
	
	public static ArrayList<Personas> EscribirEnPersona(File fchAfgenda) {
		
		ArrayList<Personas> listaContactos = new ArrayList<Personas>();
		String sNombre;
		String sNumTelefono;
		try {
			
			FileReader fch1 =new FileReader(fchAfgenda);
			BufferedReader bfLectura =new BufferedReader(fch1);
			String sSeparador ="#";
			String sLinea=bfLectura.readLine();
			
			while (sLinea!=null) {
				StringTokenizer st = new StringTokenizer(sLinea,sSeparador);
				
				sNombre=st.nextToken();
				bfLectura.readLine();
				sNumTelefono=st.nextToken();
				
				listaContactos.add(new Personas(sNombre,Integer.parseInt(sNumTelefono)));
				
				
				fch1.close();
				bfLectura.close();
				
				
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el fichero");
		}catch(IOException e) {
			System.out.println("Error al acceder al fichero");
		}
		return listaContactos;
		
		
	}


	
}
