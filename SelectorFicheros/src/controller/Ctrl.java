package controller;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ctrl {
	public static void abrirFichero() {
		JFileChooser seleccionarFch=new JFileChooser();
		int iFichero;
		seleccionarFch.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter imgFilter=new FileNameExtensionFilter("Selector de immágenes","jpg","png","bmp","gif","cr2");
		seleccionarFch.setFileFilter(imgFilter);
		
		iFichero =seleccionarFch.showOpenDialog(null);
		
		if (iFichero!=JFileChooser.CANCEL_OPTION) {
			File fileName = seleccionarFch.getSelectedFile();
			if (fileName!=null&&!fileName.getName().equals("")) {
				System.out.println(fileName.getAbsolutePath());
				
			}
			
		}
		
		
	}

}
