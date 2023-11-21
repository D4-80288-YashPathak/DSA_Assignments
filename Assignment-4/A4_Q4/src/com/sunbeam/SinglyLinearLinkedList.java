package com.sunbeam;

public class SinglyLinearLinkedList {
	class Node {
		char data;
		Node next;

		public Node(char data) {
			this.data = data;
			next = null;
		}
	}

	Node head;
	Node tail;
	final int SIZE;

	public SinglyLinearLinkedList(int size) {
		head = null;
		tail = null;
		SIZE = size;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public boolean isFull() {
		Node traverse = head;
		int count = 0;
		while (traverse.next != null) {
			traverse = traverse.next;
			count++;
		}
		return count == SIZE;
	}

	public void display() {
		Node traverse = head;
		do {
			System.out.println(traverse.data);
			traverse = traverse.next;
		} while (traverse != null);

	}

	public void displayReverse() {
		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {
			Node traverse = head;
			int count = 1;
			while (traverse != tail) {
				traverse = traverse.next;
				count++;
			}

			for (int i = count; i > 0; i--) {
				traverse = head;
				for (int j = 1; j < i; j++) {
					traverse = traverse.next;
				}
				System.out.print(traverse.data + " ");
			}
		}
	}

	public void addFirst(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void addLast(char data) {
		Node newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;
	}

	public void deleteFirst() {

		if (isEmpty())
			System.out.println("List is Empty :(");
		else if (head.next == null)
			head = null;
		else
			head = head.next;

	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("List is Empty :(");
		else if (head.next == null)
			head = null;
		else {
			Node traverse = head;
			while (traverse.next != tail)
				traverse = traverse.next;
			traverse.next = null;
			tail = traverse;
		}

	}

	public void insertAfterNode(int position, char data) {
		Node newNode = new Node(data);
		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {
			Node trav = head;
			int count = 1;
			while (trav != tail) {
				trav = trav.next;
				count++;
			}
			if (position < 1 || position > count)
				System.out.println("\nInvalid Position :(");
			else {
				trav = head;
				for (int i = 1; i < position; i++) {
					trav = trav.next;
				}
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
	}

	public void insertBeforeNode(int position, char data) {
		Node newNode = new Node(data);
		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {
			Node trav = head;
			int count = 1;
			while (trav != tail) {
				trav = trav.next;
				count++;
			}
			if (position < 1 || position > count)
				System.out.println("\nInvalid Position :(");
			else {
				trav = head;
				for (int i = 1; i < position - 1; i++) {
					trav = trav.next;
				}
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
	}

}
