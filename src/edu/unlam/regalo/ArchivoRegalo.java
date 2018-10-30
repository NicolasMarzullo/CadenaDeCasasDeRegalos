package edu.unlam.regalo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.unlam.grafo.GrafoMatriz;

public class ArchivoRegalo {

	public static GrafoMatriz cargarDatos(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int n = sc.nextInt();
		int nodoActual, nodoSig;
		int i = 0;

		GrafoMatriz grafoMatriz = new GrafoMatriz(n);

		while (i < n) {
			nodoActual = sc.nextInt();
			while ((nodoSig = sc.nextInt()) != -1)
				grafoMatriz.set(nodoActual-1, nodoSig-1, 1);
			i++;
		}

		return grafoMatriz;
	}

}
