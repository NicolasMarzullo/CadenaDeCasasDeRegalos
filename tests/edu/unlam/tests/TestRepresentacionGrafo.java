package edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.grafo.GrafoVector;


public class TestRepresentacionGrafo {
	@Test
	public void testRepresentacionConVector(){
		GrafoVector m = new GrafoVector(5);
		
		//Ver caso dibujado en una hoja
		m.set(0, 1, 1);
		m.set(0, 1, 1);
		m.set(1, 0, 1);
		m.set(1, 3, 1);
		m.set(2, 0, 1);
		m.set(2, 3, 1);
		m.set(3, 1, 1);
		m.set(3, 2, 1);
		m.set(3, 4, 1);
		
		Assert.assertEquals(1, m.get(0, 2),0.0);
		Assert.assertEquals(1, m.get(0, 2),0.0);
	}

}
