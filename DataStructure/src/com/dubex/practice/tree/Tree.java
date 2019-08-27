package com.dubex.practice.tree;

public class Tree {
	
	public Node root;
	
	public Node constructTree() {
		Node one = new Node("1");
		Node two = new Node("2");
		Node three = new Node("3");
		Node four = new Node("4");
		Node five = new Node("5");
		Node six = new Node("6");
		Node seven = new Node("7");
		Node eight = new Node("8");
		
		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		
		four.left = eight;
		
		three.left = six;
		three.right = seven;
		
		root = one;
		return root;		
	}

}
