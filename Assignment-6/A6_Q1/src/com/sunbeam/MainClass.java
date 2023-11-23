package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.addNode(5);
		bst.addNode(3);
		bst.addNode(6);
		bst.addNode(2);
		bst.addNode(4);
		bst.addNode(7);

		bst.displayInorder(bst.getRoot());
		
		System.out.println("");
		
		bst.deleteNode(5);
		bst.displayInorder(bst.getRoot());

	}

}
