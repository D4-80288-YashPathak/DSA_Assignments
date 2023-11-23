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
		bst.addNode(11);

		bst.displayInorder(bst.getRoot());

		// System.out.println("\nLeaf Nodes = " + bst.countLeafNodes(bst.getRoot(), 0));

		System.out.println("\nNon-Leaf Nodes = " + bst.countNonLeafNodes(bst.getRoot()));

		System.out.println("\nDepth of Node = " + bst.findDepthOfNode(10));

		System.out.println("\nParent of Node = " + bst.findParentOfNode(9));

		int arr[];

		if (bst.findChildrenOfNode(10) != null) {
			arr = bst.findChildrenOfNode(10);
			System.out.println("\nLeft child = " + arr[0] + " , Right child = " + arr[1]);
		} else {
			System.out.println("\nNo children of the given node :(");
		}
		System.out.println();

		bst.printAllPairsOfSiblings(bst.getRoot());
//		bst.deleteNode(5);
//		bst.displayInorder(bst.getRoot());

	}

}
