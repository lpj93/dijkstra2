package test;

import static org.junit.Assert.*;

import org.junit.Test;
import algoritmo.Edge;
import algoritmo.Vertex;


public class CreacionAristaApuntada {

	@Test
	public void test() {
				
		Vertex v0 = new Vertex("Redvile");
      Vertex v1 = new Vertex("Blueville");

      v0.adjacencies = new Edge[]{ new Edge(v1, 5) };
            
      Vertex adjacencies = v0.getAdjacencies()[0].getTarget();
      		
		
      assertTrue(adjacencies == v1);
	}


}
