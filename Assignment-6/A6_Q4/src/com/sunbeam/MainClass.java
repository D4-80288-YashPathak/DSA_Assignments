package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.addNode(5);
		bst.addNode(3);
		bst.addNode(7);
		bst.addNode(6);
		bst.addNode(2);
		bst.addNode(4);
		bst.addNode(9);
		bst.addNode(8);
		bst.addNode(10);

		bst.displayInorder(bst.getRoot());

		System.out.println("\n" + bst.countLeafNodes(bst.getRoot(), 0));

		System.out.println("\n" + bst.countNonLeafNodes(bst.getRoot()));
		
		System.out.println("\nDepth of Node = " + bst.findDepthOfNode(10));

		bst.deleteNode(5);
		bst.displayInorder(bst.getRoot());

	}

}
