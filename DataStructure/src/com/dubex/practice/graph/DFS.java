package com.dubex.practice.graph;

public class DFS {
	Graph graph;
	boolean[] visit ;
	
	public DFS(Graph graph) {
		this.graph = graph;
		this.visit = new boolean[graph.nodes.size()];
	}
	
	public void start() {
		depthFirstSearch(graph.nodes.get("0"));
	}
	
	public void depthFirstSearch(Node node) {		
		if(visit[Integer.valueOf(node.name)]) {			
			return;
		}
		
		System.out.println(node.name);
		visit[Integer.valueOf(node.name)] = true;
		if(node.connections == null || node.connections.isEmpty()) {
			return;
		} else {
			for(Edge edge : node.connections) {
				depthFirstSearch(edge.end);
			}			
		}		
		
	}
}
