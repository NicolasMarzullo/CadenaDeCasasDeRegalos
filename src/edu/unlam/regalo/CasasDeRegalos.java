package edu.unlam.regalo;

import java.util.ArrayList;

import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.grafo.Nodo;
import edu.unlam.grafo.Secuencia;

public class CasasDeRegalos {

	GrafoMatriz matAdyacencia;

	public CasasDeRegalos(GrafoMatriz matAdyacencia) {
		this.matAdyacencia = matAdyacencia;
	}

	public ArrayList<Integer> resolver() {
		ArrayList<Integer> nodosSinPintar = new ArrayList<>();
		ArrayList<Integer> nodosPintados = new ArrayList<>();
		ArrayList<Integer> secuencia;
		boolean quedanNodosPorPintar = true;

		/*
		 * Hago una pasada y pinto los nodos(siempre que se pueda) cuento la cantidad de
		 * nodos pintados y los guardo. hago otra pasada y pinto los nodos restantes,
		 * cuento cuantos pinte si ese numero es mejor al anteior, lo remplazo y
		 * remplazo todos los nodos pintados Asi sucesivamente hasta que todos los nodos
		 * estén pintados
		 */

		// Calculo una de todas las posibles secuencias
		secuencia = Secuencia.calcularCreciente(this.matAdyacencia);

		// Pinto el primer nodo de la secuencia
		nodosPintados.add(secuencia.get(0));

		//
		for (Integer i : secuencia) {
			for (int j = 0; j < secuencia.size(); j++) {
				
			}
		}


		return nodosPintados;
	}

	public GrafoMatriz getMatAdyacencia() {
		return matAdyacencia;
	}

}
