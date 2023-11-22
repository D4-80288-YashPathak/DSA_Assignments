package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.addNodeRecursive(1);
		bst.addNodeRecursive(5);
		bst.addNodeRecursive(3);
		bst.addNodeRecursive(2);
		bst.addNodeRecursive(6);
		bst.addNodeRecursive(4);
		bst.displayDataInorder(bst.getRoot());

	}

}
