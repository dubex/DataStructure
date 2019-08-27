package com.dubex.practice.graph;

public class Edge {
	public Edge(Node start, Node end, int weight) {
		super();
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	public Edge(Node start, Node end) {
		super();
		this.start = start;
		this.end = end;
	}
	public Node start;
	public Node end;
	public int weight;

}
