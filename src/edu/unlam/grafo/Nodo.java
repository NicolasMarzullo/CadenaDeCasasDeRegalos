package edu.unlam.grafo;

public class Nodo implements Comparable<Nodo> {
	private int id;
	private int color = 0;
	private int grado;

	public Nodo(int id) {
		this.id = id;
	}

	public Nodo(int id, int grado) {
		this.id = id;
		this.grado = grado;
	}

	@Override
	public int compareTo(Nodo otro) {
		return this.grado - otro.grado;
	}

	@Override
	public String toString() {
		return "Nodo [id=" + id + ", color=" + color + ", grado=" + grado + "]";
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return this.color;
	}
	

}
