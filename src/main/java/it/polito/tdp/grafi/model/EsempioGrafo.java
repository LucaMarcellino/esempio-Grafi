package it.polito.tdp.grafi.model;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class EsempioGrafo {

	public void run() {
		
		Graph<Integer,DefaultEdge> graph= new SimpleGraph<>(DefaultEdge.class);
		
		for(int i=0;i<7;i++)
			graph.addVertex(i);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 5);
		graph.addEdge(1, 5);
		graph.addEdge(3, 6);
		
		System.out.println(graph);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		EsempioGrafo eg =new EsempioGrafo();
		eg.run();

	}

}
