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
	
	public Node getHead() {
		return head;
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

	public void addFirst(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			newNode.next = newNode.previous = head;
		}
		else if(head.next == head) {
			newNode.next = head;
			newNode.previous = head;
			head.previous = newNode;
			head.next = newNode;
			head = newNode;
		}else {
			newNode.next = head;
			newNode.previous = head.previous;
			newNode.previous.next = newNode;
			head.previous = newNode;
			head = newNode;
		}
	}
	
	public void addLast(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			newNode.next = newNode.previous = head;
		}
		else if(head.next == head) {
			newNode.next = head;
			newNode.previous = head;
			head.previous = newNode;
			head.next = newNode;
		}else {
			newNode.next = head;
			newNode.previous = head.previous;
			newNode.previous.next = newNode;
			head.previous = newNode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("\nList is Empty :(");
		else if(head.next == head)
			head = null;
		else {
			head.previous.next = head.next;
			head.next.previous = head.previous;
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			System.out.println("\nList is Empty :(");
		else if(head.next == head)
			head = null;
		else {
			head.previous = head.previous.previous;
			head.previous.next = head;
		}
	}

}
