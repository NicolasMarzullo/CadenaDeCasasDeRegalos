package edu.unlam.grafo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Secuencia {

	// Algoritmo que calcula la secuencia a recorrer en orden decreciente
	public static ArrayList<Nodo> calcularWelshPowel(GrafoMatriz grafo) {
		int n = grafo.getN(), cont = 0, i, j;

		int[] grados = new int[n];
		ArrayList<Nodo> nodos = new ArrayList<>();

		for (i = 1; i < n; i++) {
			for (j = 0; j < i + 1; j++) {
				if (grafo.get(i, j) == 1) {
					grados[i]++;
					grados[j]++;
				}
			}
		}

		for (i = 0; i < n; i++)
			nodos.add(new Nodo(i, grados[i]));

		Collections.sort(nodos, Collections.reverseOrder());

		return nodos;
	}

	// Algoritmo que calcula la secuencia a recorrer en orden creciente
	public static ArrayList<Nodo> calcularMatula(GrafoMatriz grafo) {
		int n = grafo.getN(), cont = 0, i, j;

		int[] grados = new int[n];
		ArrayList<Nodo> nodos = new ArrayList<>();

		for (i = 1; i < n; i++) {
			for (j = 0; j < i + 1; j++) {
				if (grafo.get(i, j) == 1) {
					grados[i]++;
					grados[j]++;
				}

			}
		}

		for (i = 0; i < n; i++)
			nodos.add(new Nodo(i, grados[i]));

		Collections.sort(nodos);

		return nodos;
	}

	// CALCULA UNA SECUENCIA ALEATORIA
	public static ArrayList<Nodo> calcularAleaotrio(GrafoMatriz grafo) {
		ArrayList<Nodo> nodos = new ArrayList<>();

		//Armo una lista con nros del 0 al N
		List<Integer> numbers = new ArrayList<>(grafo.getN());
		for (int i = 0; i < grafo.getN(); i++) {
			numbers.add(i);
		}

		//Esto es para que el random no de siempre la misma secuencia
		Random random = new Random(System.currentTimeMillis());

		// Mientras queden numeros por sacar de la lista
		while (numbers.size() >= 1) {
			// Elijo un indice al azar entre 0 y los nros que me quedan en el vector. 
			int randomIndex = random.nextInt(numbers.size());
			
			
			//agrego el nodo cuyo ID es random al arraylist de nodos
			nodos.add(new Nodo(numbers.get(randomIndex)));

			//Elimno ese nro de la lista poraque ya lo utilice
			numbers.remove(randomIndex);
			
			//Refresco los datos aleatorios
			random.setSeed(random.nextLong());
		}

		return nodos;

	}

}
