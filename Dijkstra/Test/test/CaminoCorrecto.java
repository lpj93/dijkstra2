package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import algoritmo.Dijkstra;
import algoritmo.Edge;
import algoritmo.Vertex;


public class CaminoCorrecto {

	@Test
	public void test() {
		
		Dijkstra midij = new Dijkstra();
		
		Vertex v0 = new Vertex("Redvile");
      Vertex v1 = new Vertex("Blueville");
      Vertex v2 = new Vertex("Greenville");
      Vertex v3 = new Vertex("Orangeville");
      Vertex v4 = new Vertex("Purpleville");

      v0.adjacencies = new Edge[]{ new Edge(v1, 5),new Edge(v2, 10),new Edge(v3, 8) };
      v1.adjacencies = new Edge[]{ new Edge(v0, 5),new Edge(v2, 3),new Edge(v4, 7) };
      v2.adjacencies = new Edge[]{ new Edge(v0, 10),new Edge(v1, 3) };
      v3.adjacencies = new Edge[]{ new Edge(v0, 8),new Edge(v4, 2) };
      v4.adjacencies = new Edge[]{ new Edge(v1, 7),new Edge(v3, 2) };
	
      midij.computePaths(v0);
      
      List<Vertex> resultadoCorrecto = new ArrayList<Vertex>();
      resultadoCorrecto.add(v0);
      resultadoCorrecto.add(v3);
      resultadoCorrecto.add(v4);
      
    	List<Vertex> resultado = midij.getShortestPathTo(v4);
    	
    	
    	assertTrue(resultado.equals(resultadoCorrecto));
    	
    }

}
