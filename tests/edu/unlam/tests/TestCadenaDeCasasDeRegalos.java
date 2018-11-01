package edu.unlam.tests;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Test;

import edu.unlam.grafo.GrafoMatriz;
import edu.unlam.grafo.Nodo;
import edu.unlam.regalo.ArchivoRegalo;
import edu.unlam.regalo.CasasDeRegalos;

public class TestCadenaDeCasasDeRegalos {

	@Test
	public void TestCarga() throws FileNotFoundException {
		CasasDeRegalos casas = ArchivoRegalo.cargarDatos("tests/edu/unlam/tests/in/01_CasoEnunciado.in");

		GrafoMatriz m = casas.getMatAdyacencia();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(m.get(i, j) + "\t");
			System.out.println();
		}

	}

	@Test
	public void testCasoEnunciado() throws FileNotFoundException {
		CasasDeRegalos locales = ArchivoRegalo.cargarDatos("tests/edu/unlam/tests/in/01_CasoEnunciado.in");
		ArchivoRegalo.salida("tests/edu/unlam/tests/out/01_CasoEnunciado.out", locales.resolver());
	}

}
