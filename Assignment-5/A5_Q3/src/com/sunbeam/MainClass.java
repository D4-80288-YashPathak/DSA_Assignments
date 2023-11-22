//2. Implement stack and queue using linked list

package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DoublyLinearLinkedList dll = new DoublyLinearLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\n-------------MENU------------");
			System.out.printf("\n1. Enqueue from Front \n2. Enqueue from Rear "
					+ "\n3. Dequeue from Front \n4. Dequeue from Rear " + "\n5. Peek Front \n6. Peek Rear"
					+ "\nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter element : ");
				dll.addLast(sc.next().charAt(0));
				break;
			case 2:
				System.out.print("Enter element : ");
				dll.addFirst(sc.next().charAt(0));
				break;
			case 3:
				dll.deleteLast();
				break;
			case 4:
				dll.deleteFirst();
				break;
			case 5:
				if (dll.getTail() != null)
					System.out.println("Element at Front = " + dll.getTail().data);
				else
					System.out.println("\nDequeue is Empty :(");
				break;
			case 6:
				if (dll.getHead() != null)
					System.out.println("Element at Rear = " + dll.getHead().data);
				else
					System.out.println("\nDequeue is Empty :(");
				break;
			case 7:
				System.out.println("\n------------THANK YOU-------------");
				break;
			default:
				System.out.println("\nWrong choice :(");
				break;
			}
		} while (choice != 3);

		sc.close();
	}
}