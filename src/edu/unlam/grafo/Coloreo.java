package edu.unlam.grafo;

import java.util.ArrayList;

public class Coloreo {

	
	public static ArrayList<Nodo> colorear(GrafoMatriz matAdyacencia, ArrayList<Integer> secuencia) {
		ArrayList<Nodo> nodos = new ArrayList<>();
		ArrayList<Nodo> nodosPintados = new ArrayList<>();
		boolean pintar = true;
		int i = 0, j = 0, color = 1, cantNodosPintados=0, cantNodosPintadosMax=0, colorMax=0;
		

		/*
		 * Hago una pasada y pinto los nodos(siempre que se pueda) cuento la cantidad de
		 * nodos pintados y los guardo. hago otra pasada y pinto los nodos restantes,
		 * cuento cuantos pinte si ese numero es mejor al anteior, lo remplazo y
		 * remplazo todos los nodos pintados Asi sucesivamente hasta que todos los nodos
		 * estén pintados
		 */

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
				
				cantNodosPintados++; //Agregado para el problema en particular. Cuento los nodos pintados con un color
			}

			i++;	//Itero los nodos
			j = 0; //Reseteo el indide de nodos pintados

			if (i == nodos.size()) { // terminó una vuelta, reseteo y cambio de color.
				
				if(cantNodosPintados > cantNodosPintadosMax) {//si hay un color que pintó mas que otro, lo guardo
					cantNodosPintadosMax = cantNodosPintados;
					colorMax = color;							
				}
				
				i = 0;
				color++;  //Otro color para otra vuelta
				cantNodosPintados = 0; //Reseteo el contador
			}
		}

		/*En id del último nodo devuelvo el color que pintó mas nodos, esto lo hago para poder
		 * devolver los nodos pintados y cual es el color que pintó mayor cantidad de nodos
		 */
		Nodo nodoColorMax = new Nodo(100);
		nodoColorMax.pintar(colorMax);
		
		nodosPintados.add(nodoColorMax);
		return nodosPintados;

	}
}
