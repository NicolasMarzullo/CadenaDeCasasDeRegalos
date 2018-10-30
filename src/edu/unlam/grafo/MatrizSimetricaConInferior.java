package edu.unlam.grafo;

public class MatrizSimetricaConInferior {
	private int n;
	private int[][] matrizTI;

	public MatrizSimetricaConInferior() {
		// creo filas
		matrizTI = new int[n][];
		// creo las columnas
		// Para la fila 1 va a haber 1 columna, para la 2... dos y asi
		// sucesivamente
		for (int i = 1; i < n; i++) {
			matrizTI[i] = new int[i];
		}
	}
	
	public int get(int f, int c){
		int aux;
		
		if(c==f)
			return -1;
		
		if(c>f){
			aux = c;
			c = f;
			f = aux;
		}
		
		return this.matrizTI[f][c];
	}
	
	public void set(int f, int c, int valor){
		int aux;
		
		if(f==c)
			return;
		
		if(c>f){
			aux = c;
			c = f;
			f = aux;
		}
		
		this.matrizTI[f][c] = valor;
	}

}
