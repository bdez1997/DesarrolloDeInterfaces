package model;

import java.util.ArrayList;

public class Languages {
	public static ArrayList<String>sEsp=new ArrayList<String>();
	public static ArrayList<String>sEng=new ArrayList<String>();
	public static void cargarLenguajes() {
				
		String[] sEspanol= {"Hacer","Perro","Gato","Hola","Noche","Caballero","Estudiante","Agujero","Rueda","Mesa"};
		String[] sEnglish= {"Do","Dog","Cat","Hello","Night","Knight","Student","Hole","Wheel","Table"};
		
		for (int i = 0; i < sEspanol.length; i++) {
			sEsp.add(sEspanol[i]);
			sEng.add(sEnglish[i]);
		}
	}
	
}
