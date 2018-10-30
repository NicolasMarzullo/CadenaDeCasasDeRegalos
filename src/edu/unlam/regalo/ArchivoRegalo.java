package edu.unlam.regalo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.unlam.grafo.GrafoVector;

public class ArchivoRegalo {
	
	public static GrafoVector cargarDatos(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		GrafoVector grafoVector = new GrafoVector(sc.nextInt());
		
		return grafoVector;
	}

}
