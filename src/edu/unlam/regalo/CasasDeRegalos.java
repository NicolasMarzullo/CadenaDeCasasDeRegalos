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

	public ArrayList<Nodo> resolver() {
		ArrayList<Nodo> nodos = new ArrayList<>();
		ArrayList<Nodo> nodosPintados = new ArrayList<>();
		ArrayList<Integer> secuencia;
		boolean pintar = true;
		int i = 0, j = 0, color = 1;

		/*
		 * Hago una pasada y pinto los nodos(siempre que se pueda) cuento la cantidad de
		 * nodos pintados y los guardo. hago otra pasada y pinto los nodos restantes,
		 * cuento cuantos pinte si ese numero es mejor al anteior, lo remplazo y
		 * remplazo todos los nodos pintados Asi sucesivamente hasta que todos los nodos
		 * estén pintados
		 */

		// Calculo una de todas las posibles secuencias
		secuencia = Secuencia.calcularCreciente(this.matAdyacencia);

		// Agrego los nodos según la secuencia solicitada.
		for (Integer in : secuencia)
			nodos.add(new Nodo(in));

		while (nodosPintados.size() != this.matAdyacencia.getN()) { // el corte es cuando pinté todos los nodos.
			pintar = true;

			while (j < nodosPintados.size() && pintar && nodos.get(i).getColor() == 0) { // While de los nodos pintados
				if (i != j) {

					if (this.matAdyacencia.get(nodos.get(i).getId(), nodosPintados.get(j).getId()) == 1
							&& nodosPintados.get(j).getColor() == color)
						pintar = false;
				}
				j++;
			}

			if (pintar && nodos.get(i).getColor() == 0) {
				nodos.get(i).pintar(color);
				nodosPintados.add(nodos.get(i));
			}

			i++;
			j = 0;

			if (i == secuencia.size()) { // termino la secuencia, no el pintado.
				i = 0;
				color++; // reseteo la secuencia y cambio de color
			}
		}

		return nodosPintados;

	}

	public GrafoMatriz getMatAdyacencia() {
		return matAdyacencia;
	}

}
