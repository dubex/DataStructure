package com.dubex.practice.graph;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable{
	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}
	public String name;
	int cost;
	public List<Edge> connections = new ArrayList<Edge>();
	

	@Override
	public int compareTo(Object arg0) {
		if(cost > ((Node)arg0).cost)
		return 1;
		else return -1;
	}
}
