package edu.unlam.tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.grafo.GrafoVector;
import edu.unlam.grafo.Nodo;
import edu.unlam.grafo.Secuencia;

public class TestGrafo {
	@Test
	public void testRepresentacionConVector() {
		GrafoVector m = new GrafoVector(5);

		// Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 2, 1);
		m.set(1, 3, 1);
		m.set(2, 3, 1);
		m.set(3, 4, 1);

		// pruebo todas las aristas
		Assert.assertEquals(1, m.get(0, 1), 0.0);
		Assert.assertEquals(1, m.get(1, 0), 0.0);
		Assert.assertEquals(1, m.get(1, 3), 0.0);
		Assert.assertEquals(1, m.get(3, 1), 0.0);
		Assert.assertEquals(1, m.get(2, 0), 0.0);
		Assert.assertEquals(1, m.get(0, 2), 0.0);
		Assert.assertEquals(1, m.get(2, 3), 0.0);
		Assert.assertEquals(1, m.get(3, 2), 0.0);
		Assert.assertEquals(1, m.get(3, 4), 0.0);
		Assert.assertEquals(1, m.get(4, 3), 0.0);
		// error, no es considerada la diagonal principal
		Assert.assertEquals(-1, m.get(0, 0), 0.0);

		// Error, no hay union entre ellos
		Assert.assertEquals(0, m.get(0, 3), 0.0);
		Assert.assertEquals(0, m.get(4, 0), 0.0);
	}

	@Test
	public void testRepresentacionConMatriz() {
		GrafoMatriz m = new GrafoMatriz(5);

		// Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 2, 1);
		m.set(1, 3, 1);
		m.set(2, 3, 1);
		m.set(3, 4, 1);

		// pruebo todas las aristas
		Assert.assertEquals(1, m.get(0, 1), 0.0);
		Assert.assertEquals(1, m.get(1, 0), 0.0);
		Assert.assertEquals(1, m.get(1, 3), 0.0);
		Assert.assertEquals(1, m.get(3, 1), 0.0);
		Assert.assertEquals(1, m.get(2, 0), 0.0);
		Assert.assertEquals(1, m.get(0, 2), 0.0);
		Assert.assertEquals(1, m.get(2, 3), 0.0);
		Assert.assertEquals(1, m.get(3, 2), 0.0);
		Assert.assertEquals(1, m.get(3, 4), 0.0);
		Assert.assertEquals(1, m.get(4, 3), 0.0);
		// error, no es considerada la diagonal principal
		Assert.assertEquals(-1, m.get(0, 0), 0.0);

		// Error, no hay union entre ellos
		Assert.assertEquals(0, m.get(0, 3), 0.0);
		Assert.assertEquals(0, m.get(4, 0), 0.0);
	}
	
	
	@Test
	public void testSecuenciaMatula() {
		GrafoMatriz m = new GrafoMatriz(5);

		// Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 2, 1);
		m.set(1, 3, 1);
		m.set(2, 3, 1);
		m.set(3, 4, 1);

		ArrayList<Integer> secuencia = Secuencia.calcularMatula(m);
		
		for(Integer i: secuencia)
			System.out.println(i);
		
	}
	
	@Test
	public void testSecuenciaWelshPowel() {
		GrafoMatriz m = new GrafoMatriz(5);

		// Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 2, 1);
		m.set(1, 3, 1);
		m.set(2, 3, 1);
		m.set(3, 4, 1);

		ArrayList<Integer> secuencia = Secuencia.calcularWelshPowel(m);
		
		for(Integer i: secuencia)
			System.out.println(i);
		
	}
	
	@Test
	public void testSecuenciaRandom() {
		GrafoMatriz m = new GrafoMatriz(5);

		// Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 2, 1);
		m.set(1, 3, 1);
		m.set(2, 3, 1);
		m.set(3, 4, 1);

		ArrayList<Integer> secuencia = Secuencia.calcularAleaotrio(m);
		
		for(Integer i: secuencia)
			System.out.println(i);
		
	}
	
	

}
