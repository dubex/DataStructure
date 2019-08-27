package com.dubex.practice.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	Graph graph;
	Queue<Node> queue = new LinkedList<Node>();
	boolean[] visited;
	
	public BFS(Graph graph) {
		this.graph = graph;
		this.visited = new boolean[graph.nodes.size()];
	}
	
	public void start() {
		breadthFirstSearch(graph.nodes.get("0"));
	}
	
	public void breadthFirstSearch(Node node) {
		if(visited[Integer.valueOf(node.name)]) {
			return;
		}
		
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node theNode = queue.poll();
			
			if(visited[Integer.valueOf(theNode.name)]) {
				continue;
			}
			
			System.out.println(theNode.name);
			visited[Integer.valueOf(theNode.name)] = true;
			
			if(theNode.connections == null || theNode.connections.isEmpty()) {		
				continue;
			}
			
			for(Edge edge: theNode.connections) {
				queue.add(edge.end);
			}
		}			
	}
}
