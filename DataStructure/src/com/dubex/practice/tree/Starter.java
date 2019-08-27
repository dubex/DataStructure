package com.dubex.practice.tree;

public class Starter {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.constructTree();
		//System.out.println(new TreeOperation(tree).getTreeHeight());
		System.out.println(new TreeOperation(tree).findMaxWidth());
	}

}
