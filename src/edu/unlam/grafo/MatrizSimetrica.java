package edu.unlam.grafo;

public class MatrizSimetrica {

	private int n;
	private int[] vector;

	public MatrizSimetrica(int n) {
		this.n = n;
		this.vector = new int[n * (n - 1) / 2];
	}

	public int get(int f, int c) {
		int aux;
		if (f == c)
			return -1;
		if (f > c) {
			aux = f;
			f = c;
			c = aux;
		}

		// Formula loca que el profe descubri� con su alumno preferido.
		// #Pedofilo
		return this.vector[f * this.n + c - (f * f + 3 * f + 2) / 2];
	}

	
	public void set(int f, int c, int valor) {
		int aux;
		if (f == c)
			return;
		if (f > c) {
			aux = f;
			f = c;
			c = aux;
		}

		// Formula loca que el profe descubri� con su alumno preferido.
		// #Pedofilo
		this.vector[f * this.n + c - (f * f + 3 * f + 2) / 2] = valor;
	}
}
