package com.dubex.practice.graph;

import java.util.Stack;

public class TopologicalSort {
	Graph graph;
	
	boolean visited[];
	private Stack<String> stack = new Stack<String>(); 
	public TopologicalSort(Graph graph) {
		this.graph = graph;
		this.visited = new boolean[graph.nodes.size()];
	}
	
	private void topologicalSort(Node node) {
		
		if(visited[Integer.valueOf(node.name)]) {
			return;
		}
		
		visited[Integer.valueOf(node.name)] = true;
		
		for(Edge edge: node.connections) {
			if(!visited[Integer.valueOf(edge.end.name)]) {
				topologicalSort(edge.end);
			}
		}
		
		stack.add(node.name);
	}
	
	public void printTopologicalSort() {
		for(String key: graph.nodes.keySet()) {
			if(!visited[Integer.valueOf(key)])
				topologicalSort(graph.nodes.get(key));
		}
		
		System.out.println(stack);
	}	

}
