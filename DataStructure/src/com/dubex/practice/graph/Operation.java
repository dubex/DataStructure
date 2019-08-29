package com.dubex.practice.graph;

public class Operation {
	

	public static void main(String[] args) {
		
		Graph graph = new Graph();
//		graph.constructGraph();
		
		graph.constructTopologicalSort();
		
		TopologicalSort ts = new TopologicalSort(graph);
		ts.printTopologicalSort();
		
//		DFS theDfs = new DFS(graph);
//		theDfs.start();
		
//		BFS theBfs = new BFS(graph);
//		theBfs.start();
	}

}
