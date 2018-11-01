package edu.unlam.regalo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.grafo.Nodo;

public class ArchivoRegalo {

	public static CasasDeRegalos cargarDatos(String path) throws FileNotFoundException {
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

		sc.close();
		return new CasasDeRegalos(grafoMatriz);
		
	}

	public static void salida(String path, ArrayList<Nodo> resultado) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File(path));
		
		pw.println(resultado.size());
		
		for(Nodo n: resultado) {
			pw.println(n.getId()+1 + "\t");
		}
		
		pw.close();
	}
}
