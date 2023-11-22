package com.sunbeam;

public class DoublyCircularLinkedList {

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

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void display() {
		if (isEmpty())
			System.out.println("\nList is Empty :(");
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

	public void addAtPosition(char data, int position) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head.previous = head;
			return;
		}

		Node trav = head;
		int count = 0;
		do {
			trav = trav.next;
			count++;
		} while (trav != head);

		if (position < 1 || position > count) {
			System.out.println("\nInvalid Position :(");
		} else if (position == 1 && head.next == head) {
			head.previous = newNode;
			newNode.next = head;
			newNode.previous = head;
			head.next = newNode;
			head = newNode;
		} else {
			trav = head;
			if (position == 1) {
				newNode.next = head;
				newNode.previous = head.previous;
				head.previous.next = newNode;
				head.previous = newNode;
				head = newNode;
				return;
			}
			for (int i = 1; i < position; i++) {
				trav = trav.next;
			}
			newNode.next = trav;
			newNode.previous = trav.previous;
			trav.previous.next = newNode;
			trav.previous = newNode;
		}
	}
	
	public void deleteAtPosition(int position) {
		if (isEmpty()) {
			System.out.println("\nList is Empty");
			return;
		}

		Node trav = head;
		int count = 0;
		do {
			trav = trav.next;
			count++;
		} while (trav != head);

		if (position < 1 || position > count) {
			System.out.println("\nInvalid Position :(");
		} else if (position == 1 && head.next == head) {
			head = null;
		} else {
			trav = head;
			if (position == 1) {
				head.previous.next = head.next;
				head.next.previous = head.previous;
				head = head.next;
				return;
			}
			for (int i = 1; i < position; i++) {
				trav = trav.next;
			}
			trav.next.previous = trav.previous;
			trav.previous.next = trav.next;
		}	
	}

}
