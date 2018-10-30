package edu.unlam.regalo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.unlam.grafo.GrafoMatriz;

public class ArchivoRegalo {

	public static GrafoMatriz cargarDatos(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int n = sc.nextInt(), nro;
		
		GrafoMatriz grafoMatriz = new GrafoMatriz(n);
		
		for (int i = 0; i < n; i++) {
			if((nro = sc.nextInt())!=-1)
				grafoMatriz.set(i, nro, 1);
		}
			

		return grafoMatriz;
	}

}
