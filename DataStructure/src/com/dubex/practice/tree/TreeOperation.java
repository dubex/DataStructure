package com.dubex.practice.tree;

public class TreeOperation {
	
	Tree tree;
	
	public TreeOperation(Tree tree) {
		this.tree = tree;
	}
	
	public int findMaxWidth() {
		int maxHeight = 0;
		int h = getTreeHeight();
		for(int i=0; i<h; i++ ) {
			int temp = getWidthOfNode(tree.root, i);
			if(temp > maxHeight) maxHeight = temp;
		}
		return maxHeight;
	}
	
	private int getWidthOfNode(Node node, int level) {
		if(node == null || level < 0) return 0;
		if(level == 0) return 1;
		return getWidthOfNode(node.left, level-1) + getWidthOfNode(node.right, level-1);
	}
	
	public int getTreeHeight() {
		return getHeightOfNode(tree.root);
	}
	
	private int getHeightOfNode(Node node) {
		Node root = node;
		
		if(root == null) return 0;
		
		int leftHeight = getHeightOfNode(node.left) + 1;
		int rightHeight = getHeightOfNode(node.right) + 1;
		
		if(leftHeight > rightHeight) return leftHeight;
		else return rightHeight;
	}

}
