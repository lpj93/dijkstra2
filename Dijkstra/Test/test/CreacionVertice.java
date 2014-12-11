package test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import algoritmo.Vertex;


public class CreacionVertice {

	@Test
	public void test() {
		
		Vector<Vertex> myvector = new Vector<Vertex>();
		
		Vertex v0 = new Vertex("Redvile");
		
		myvector.add(v0);
		String resultado = myvector.get(0).toString();
		
		assertTrue(resultado =="Redvile");
	
	}

}
