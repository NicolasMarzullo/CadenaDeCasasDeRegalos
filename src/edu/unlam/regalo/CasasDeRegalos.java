package edu.unlam.regalo;

import java.util.ArrayList;

import edu.unlam.grafo.Coloreo;
import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.grafo.Nodo;
import edu.unlam.grafo.Secuencia;

public class CasasDeRegalos {

	GrafoMatriz matAdyacencia;

	public CasasDeRegalos(GrafoMatriz matAdyacencia) {
		this.matAdyacencia = matAdyacencia;
	}

	public ArrayList<Nodo> resolver() {
		ArrayList<Nodo> resultado = new ArrayList<>();
		ArrayList<Nodo> nodosPintados;
		
		nodosPintados = Coloreo.colorear(this.matAdyacencia);
		
		//Hacer lo que pide el enunciado, aquellos nodos que tengan color maximo.
				
		return resultado;
	}

	public GrafoMatriz getMatAdyacencia() {
		return matAdyacencia;
	}

}
