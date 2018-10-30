package edu.unlam.grafo;

import java.util.ArrayList;
import java.util.Collections;

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
}
