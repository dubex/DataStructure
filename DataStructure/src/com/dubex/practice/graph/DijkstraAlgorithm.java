package com.dubex.practice.graph;

import java.util.PriorityQueue;
import java.util.Queue;

import com.dubex.practice.tree.Node;

public class DijkstraAlgorithm {
	Graph graph;
	
	Queue<Node> priorityQueue = new PriorityQueue<Node>();
	
	public DijkstraAlgorithm() {
		this.graph = graph;
	}
	
	public void shortestPath(Node source) {
		priorityQueue.add(source);
		
		if(!priorityQueue.isEmpty()) {
			Node node = priorityQueue.poll();
			
		}
	}
	
	
	
	
	
	

}
