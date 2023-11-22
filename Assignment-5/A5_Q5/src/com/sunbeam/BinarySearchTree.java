package com.sunbeam;

public class BinarySearchTree {
	static class Node {
		private int data;
		private Node right;
		private Node left;

		public Node(int data) {
			this.data = data;
			right = left = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		return false;
	}

	public Node getRoot() {
		return root;
	}

	public void displayDataInorder(Node trav) {
		if (trav == null)
			return;
		displayDataInorder(trav.left); // left
		System.out.print(" " + trav.data); // visit
		displayDataInorder(trav.right); // right

	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (isEmpty())
			root = newNode;
		else {
			Node trav = root;
			while (true) {
				if (data < trav.data) {
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else
						trav = trav.right;
				}

			}

		}
	}

	public void addNodeRecursive(int data) {
		Node newNode = new Node(data);

		if (isEmpty())
			root = newNode;
		else
			addNodeRecursive(data, root);
	}

	public void addNodeRecursive(int data, Node trav) {
		if (data < trav.data)
			if (trav.left == null)
				trav.left = new Node(data);
			else
				addNodeRecursive(data, trav.left);
		else if (trav.right == null)
			trav.right = new Node(data);
		else
			addNodeRecursive(data, trav.right);

	}

	public void search(int data) {
		Node trav = root;
		if (isEmpty()) {
			System.out.println("\nNot Found :(");
			return;
		} else {
			while (trav != null) {
				if (trav.data == data) {
					System.out.println("\nFound :)");
					return;
				} else if (data < trav.data) {
					trav = trav.left;
				} else
					trav = trav.right;
			}
			System.out.println("\nNot Found :(");
		}
	}

	public void searchRecursion(int data) {
		if (isEmpty()) {
			System.out.println("\nNot Found");
		} else
			searchRecursion(data, root);
	}

	public void searchRecursion(int data, Node trav) {
		if (trav == null)
			System.out.println("\nNot Found");
		else if (data == trav.data)
			System.out.println("\nFound");
		else if (data < trav.data)
			searchRecursion(data, trav.left);
		else
			searchRecursion(data, trav.right);

	}
}