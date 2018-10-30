package edu.unlam.tests;

import java.io.FileNotFoundException;

import org.junit.Test;

import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.regalo.ArchivoRegalo;

public class TestCadenaDeCasasDeRegalos {

	@Test
	public void TestCarga() throws FileNotFoundException {
		GrafoMatriz m = ArchivoRegalo.cargarDatos("tests/edu/unlam/tests/in/01_CasoEnunciado.in");
		
		
		for(int i=0;i<8;i++) {
			for(int j=0; j<i+1;j++)
				System.out.print(m.get(i, j) + "\t");
			System.out.println();
		}
	}
	
}
