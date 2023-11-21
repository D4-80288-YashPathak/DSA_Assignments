package com.sunbeam;
import java.util.Scanner;

public class SinglyLinearLinkedList {
	class Node {
		Employee e;
		Node next;

		public Node(Employee e) {
			this.e = e;
			next = null;
		}
	}

	Node head;
	Node tail;

	public SinglyLinearLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void display() {

		Node traverse = head;
		do {
			System.out.println(traverse.e.toString());
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
				System.out.print(traverse.e.toString());
			}
		}
	}

	public void addFirst(Employee e) {
		Node newNode = new Node(e);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void addLast(Employee e) {
		Node newNode = new Node(e);
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

	public void insertAfterNode(int position, Employee e) {
		Node newNode = new Node(e);
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

	public void insertBeforeNode(int position, Employee e) {
		Node newNode = new Node(e);

		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {

			Node trav = head;
			int count = 1;
			while (trav != tail) {
				trav = trav.next;
				count++;
			}
			if (position < 1 || count < position) {
				System.out.println("\nInvalid Position :(");

			}

			else if (position == 1) {

				newNode.next = head;
				head = newNode;
			} else {
				trav = head;
				for (int i = 1; i < position - 1; i++) {
					trav = trav.next;
				}
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
	}

	public void insertInSortedOrder(Employee e) {
		Node newNode = new Node(e);
		int count = 1;
		if (isEmpty())
			tail = head = newNode;
		else if (head.next == null) {
			if (head.e.id < newNode.e.id) {
				head.next = newNode;
				tail = newNode;
			} else {
				newNode.next = head;
				head = newNode;

			}
		} else {
			Node trav = head;

			while (trav.next != null) {

				if (trav.e.id < newNode.e.id) {
					// System.out.println("inside 1");
					count++;
					trav = trav.next;
				} else {
					insertBeforeNode(count, e);
					return;
				}
			}

			if (trav == tail) {
				if (trav.e.id < newNode.e.id) {
					trav.next = newNode;
					tail = newNode;
					count++;
					trav = trav.next;
				} else {
					insertBeforeNode(count, e);
					return;
				}
			}
		}
	}

	public boolean searchByName(String name) {
		Node trav = head;
		while (trav.next != null) {
			if (trav.e.name.equals(name))
				return true;
			trav = trav.next;
		}
		if (trav.e.name.equals(name))
			return true;
		return false;
	}

	public void deleteEmployeeById(int id) {
		Node trav = head;
		if (head.e.id == id) {
			if (head.next == null) {
				head = null;
				System.out.println("\nEmployee Deleted :)");
				return;
			} else {
				head = head.next;
				System.out.println("\nEmployee Deleted :)");
				return;
			}
		}
		while (trav != tail) {
			if (trav.next.e.id == id) {
				if (trav.next.next == null) {
					trav.next = null;
					System.out.println("\nEmployee Deleted :)");
					return;
				}

				else {
					trav.next = trav.next.next;
					System.out.println("\nEmployee Deleted :)");
					return;
				}
			}

		}
		System.out.printf("\nEmployee with ID = %d not found :(", id);
	}

	public void updateSalary(int id, Scanner sc) {
		if (isEmpty())
			System.out.println("\nList is Empty :(");
		else {
			Node trav = head;
			while (trav != tail) {
				if (trav.e.id == id) {
					System.out.print("\nEnter the new Salary : ");
					trav.e.setSalary(sc.nextDouble());
					System.out.println("\nSalary Updated :)");
					return;
				}
			}
			if (trav.e.id == id) {
				System.out.print("\nEnter the new Salary : ");
				trav.e.setSalary(sc.nextDouble());
				System.out.println("\nSalary Updated :)");
				return;
			}
			System.out.println("\nEmployee not found :(");

		}

	}

}
