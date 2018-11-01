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
		ArrayList<Integer> secuencia = Secuencia.calcularCreciente(this.matAdyacencia);
		// Coloreo el grafo con una secuencia ya calculada
		nodosPintados = Coloreo.colorear(this.matAdyacencia, secuencia);
		int colorMax = nodosPintados.get(nodosPintados.size() - 1).getColor();

		for (int i = 0; i < nodosPintados.size() - 1; i++) {
			if (nodosPintados.get(i).getColor() == colorMax)
				resultado.add(nodosPintados.get(i));
		}

		return resultado;
	}

	public GrafoMatriz getMatAdyacencia() {
		return matAdyacencia;
	}

}
