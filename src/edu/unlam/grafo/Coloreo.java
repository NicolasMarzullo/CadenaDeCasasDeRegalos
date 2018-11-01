package edu.unlam.grafo;

import java.util.ArrayList;

public class Coloreo {

	
	public static ArrayList<Nodo> colorear(GrafoMatriz matAdyacencia) {
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
		secuencia = Secuencia.calcularMatula(matAdyacencia);

		// Agrego los nodos según la secuencia solicitada.
		for (Integer in : secuencia)
			nodos.add(new Nodo(in));

		while (nodosPintados.size() != matAdyacencia.getN()) { // el corte es cuando pinté todos los nodos.
			pintar = true;

			while (j < nodosPintados.size() && pintar && nodos.get(i).getColor() == 0) { // While de los nodos pintados
				// Este while Se fija de no seguir iteranso si no hay que pintarlo, y tambien
				// busca no comparar un nodo ya pintado
				if (i != j) {
					if (matAdyacencia.get(nodos.get(i).getId(), nodosPintados.get(j).getId()) == 1
							&& nodosPintados.get(j).getColor() == color)  //Si hay union y sus colores son iguales, no debo pintarlo.
						pintar = false;
				}
				j++;
			}

			if (pintar && nodos.get(i).getColor() == 0) {	//Si hay que pintarlo y no tiene color, lo pinto.
				nodos.get(i).pintar(color);
				nodosPintados.add(nodos.get(i));
			}

			i++;	//Itero los nodos
			j = 0; //Reseteo el indide de nodos pintados

			if (i == nodos.size()) { // terminó una vuelta, reseteo y cambio de color.
				i = 0;
				color++; 
			}
		}

		return nodosPintados;

	}
}
