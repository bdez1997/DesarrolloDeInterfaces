package controller;

import java.io.*;


public class Ctrl {
	
	public static String abrirManual() {
		String sRuta = "Manual.txt";
		String sResultado="";
		try {
			RandomAccessFile raFch = new RandomAccessFile(sRuta, "r");
			byte[]bFichero=new byte[(int)raFch.length()];
			raFch.readFully(bFichero);
			
			sResultado=new String(bFichero);
			raFch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sResultado;
		
	}
	public static String abrirAcercaDe() {
		String sRuta = "AcercaDe.txt";
		String sResultado="";
		try {
			RandomAccessFile raFch = new RandomAccessFile(sRuta, "r");
			byte[]bFichero=new byte[(int)raFch.length()];
			raFch.readFully(bFichero);
			
			sResultado=new String(bFichero);
			raFch.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sResultado;
		
	}

}
