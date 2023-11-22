package com.sunbeam;

public class DoublyLinearLinkedList {

	static class Node {
		char data;
		Node next;
		Node previous;

		public Node(char data) {
			this.data = data;
			next = null;
			previous = null;
		}
	}

	Node head;
	Node tail;

	public DoublyLinearLinkedList() {
		head = null;
		tail = null;
	}

	public Node getHead() {
			return head;
	}

	public Node getTail() {
		return tail;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void display() {
		if (isEmpty())
			System.out.println("\nDequeue is Empty :(");
		else if (head.next == head) {
			System.out.println(head.data);
		} else {
			Node trav = head;
			do {
				System.out.println(trav.data);
				trav = trav.next;
			} while (trav != head);
		}
	}

	public void addFirst(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	public void addLast(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.previous = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("\nDequeue is Empty :(");
		else if (head == tail)
			tail = head = null;
		else {
			head = head.next;
			head.previous = null;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("\nDequeue is Empty :(");
		else if (head == tail)
			tail = head = null;
		else {
			tail = tail.previous;
			tail.next = null;
		}
	}

}
