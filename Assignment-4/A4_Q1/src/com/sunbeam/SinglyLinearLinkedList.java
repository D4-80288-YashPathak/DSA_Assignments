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

}
