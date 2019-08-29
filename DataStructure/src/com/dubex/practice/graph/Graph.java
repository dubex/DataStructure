package com.dubex.practice.graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	public Map<String, Node> nodes = new HashMap<String, Node>();
	
	public void constructGraph() {
		Node zero = new Node();
		zero.name = "0";
		
		Node one = new Node();
		one.name = "1";
		
		Node two = new Node();
		two.name = "2";
		
		Node three = new Node();
		three.name = "3";
		
		Node four = new Node();
		four.name = "4";
		
		Node five = new Node();
		five.name = "5";
		
		Node six = new Node();
		six.name = "6";
		
		Node seven = new Node();
		seven.name = "7";
		
		Node eight = new Node();
		eight.name = "8";
		
		nodes.put("0", zero);
		nodes.put("1", one);
		nodes.put("2", two);
		nodes.put("3", three);
		nodes.put("4", four);
		nodes.put("5", five);
		nodes.put("6", six);
		nodes.put("7", seven);
		nodes.put("8", eight);
		
		zero.connections.add(new Edge(zero, one));
		zero.connections.add(new Edge(zero, three));
		
		one.connections.add(new Edge(one, seven));
		
		seven.connections.add(new Edge(seven, two));
		
		three.connections.add(new Edge(three, two));
		three.connections.add(new Edge(three, four));
		
		four.connections.add(new Edge(four, eight));
		
		eight.connections.add(new Edge(eight, zero));
		
		two.connections.add(new Edge(two, five));
		
		five.connections.add(new Edge(five, six));
	}
	
	public void constructTopologicalSort() {
		Node zero = new Node();
		zero.name = "0";
		
		Node one = new Node();
		one.name = "1";
		
		Node two = new Node();
		two.name = "2";
		
		Node three = new Node();
		three.name = "3";
		
		Node four = new Node();
		four.name = "4";
		
		Node five = new Node();
		five.name = "5";
		
		five.connections.add(new Edge(five, two));
		five.connections.add(new Edge(five, zero));
		
		four.connections.add(new Edge(four, zero));
		four.connections.add(new Edge(four, one));
		two.connections.add(new Edge(two, three));
		
		nodes.put("0", zero);
		nodes.put("1", one);
		nodes.put("2", two);
		nodes.put("3", three);
		nodes.put("4", four);
		nodes.put("5", five);
//        g.addEdge(5, 2); 
//        g.addEdge(5, 0); 
//        g.addEdge(4, 0); 
//        g.addEdge(4, 1); 
//        g.addEdge(2, 3); 
//        g.addEdge(3, 1); 
	}
	
	public void constructGraphWithEdgeWeight() {
		Node zero = new Node();
		zero.name = "0";
		
		Node one = new Node();
		one.name = "1";
		
		Node two = new Node();
		two.name = "2";
		
		Node three = new Node();
		three.name = "3";
		
		Node four = new Node();
		four.name = "4";
		
		Node five = new Node();
		five.name = "5";
		
		five.connections.add(new Edge(five, two));
		five.connections.add(new Edge(five, zero));
		
		four.connections.add(new Edge(four, zero));
		four.connections.add(new Edge(four, one));
		two.connections.add(new Edge(two, three));
		
		nodes.put("0", zero);
		nodes.put("1", one);
		nodes.put("2", two);
		nodes.put("3", three);
		nodes.put("4", four);
		nodes.put("5", five);
//        g.addEdge(5, 2); 
//        g.addEdge(5, 0); 
//        g.addEdge(4, 0); 
//        g.addEdge(4, 1); 
//        g.addEdge(2, 3); 
//        g.addEdge(3, 1); 
	}	

}
