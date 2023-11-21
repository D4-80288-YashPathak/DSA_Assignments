package com.sunbeam;

public class SinglyCircularLinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node tail;

	public SinglyCircularLinkedList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void display() {
		if (!isEmpty()) {
			Node traverse = tail.next;
			do {
				System.out.println(traverse.data);
				traverse = traverse.next;
			} while (traverse != tail.next);
		} else
			System.out.println("\nList is Empty :(");

	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAtPosition(int data, int position) {
		Node traverse = tail.next;
		int count = 1;
		Node newNode = new Node(data);

		if (isEmpty()) {
			System.out.println("\n List is empty so adding to 1st position :)");
			tail = newNode;
			newNode.next = tail;
		} else {
			do {
				traverse = traverse.next;
				count++;
			} while (traverse.next != tail.next);

			if (position < 1 || position > count)
				System.out.println("Please enter valid position");
			else {
				// System.out.println("I am in");
				traverse = tail.next;
				for (int i = 1; i < position - 1; i++) {
					traverse = traverse.next;

				}
				newNode.next = traverse.next;
				traverse.next = newNode;
			}
		}

	}

	public void deleteFirst() {
		if (!isEmpty())
			tail.next = tail.next.next;
		else
			System.out.println("\nList is Empty :(");
	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("\n List is Empty :(");
		else {
			Node traverse = tail.next;
			while (traverse.next != tail)
				traverse = traverse.next;
			traverse.next = tail.next;
			tail = traverse;
		}
	}

	public void deleteFromPosition(int position) {
		int count = 1;
		Node traverse = tail.next;

		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {
			do {
				traverse = traverse.next;
				count++;
			} while (traverse.next != tail.next);

			if (position < 1 || position > count)
				System.out.println("Please enter valid position");
			else {
				// System.out.println("I am in");
				traverse = tail.next;
				for (int i = 1; i < position - 1; i++) {
					traverse = traverse.next;

				}
				traverse.next = traverse.next.next;
			}
		}
	}

}
