package com.sunbeam;

public class BinarySearchTree {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void displayInorder(Node trav) {
		if (trav == null)
			return;
		displayInorder(trav.left);
		System.out.print(trav.data + " ");
		displayInorder(trav.right);

	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		Node trav = root;
		if (isEmpty())
			root = newNode;
		else {
			while (true) {
				if (data < trav.data)
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else
						trav = trav.left;
				else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else
						trav = trav.right;
				}

			}
		}

	}

	public Node[] searchWithParent(int data) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (trav.data == data) {
				parent = trav;
				break;
			} else if (data < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return new Node[] { trav, parent };
	}

	public void deleteNode(int data) {
		Node arr[] = searchWithParent(data);
		Node node = arr[0];
		Node parent = arr[1];

		if (node == null) {
			System.out.println("\nTree is Empty :(");
			return;
		}

		if (node.left != null && node.right != null) {
			Node successor = node.right;
			parent = node;
			while (successor.left != null) {
				parent = successor;
				successor = successor.left;
			}
			node.data = successor.data;
			node = successor;
		}

		if (node.left == null) {
			if (node == root)
				root = node.right;
			else if (node == parent.left) {
				parent.left = node.right;
			} else
				parent.right = node.right;
		} else if (node.right == null) {
			if (node == root)
				root = node.left;
			else if (node == parent.left)
				parent.left = node.left;
			else
				parent.right = node.left;
		}

	}

	public int countLeafNodes(Node trav, int count) {
		if (trav.left == null && trav.right == null)
			return ++count;
		if (trav.left != null) {
			count = countLeafNodes(trav.left, count);
		}
		if (trav.right != null) {
			count = countLeafNodes(trav.right, count);
		}

		return count;
	}

	public int countNonLeafNodes(Node node) {

		if (node == null) {
			return 0;
		}

		// Check if the current node is a leaf node
		if (node.left != null || node.right != null) {
			// If at least one child exists, it's not a leaf node
			return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
		} else {
			// Leaf node
			return 0;
		}
	}

}
