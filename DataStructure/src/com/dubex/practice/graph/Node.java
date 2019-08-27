package com.dubex.practice.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}
	public String name;
	public List<Edge> connections = new ArrayList<Edge>();
	
	
}
