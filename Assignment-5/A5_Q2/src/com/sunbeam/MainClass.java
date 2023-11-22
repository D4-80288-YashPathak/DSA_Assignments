//2. Implement stack and queue using linked list

package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DoublyCircularLinkedList dcl = new DoublyCircularLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\n-------------MENU------------");
			System.out.println("1. Stack \n2. Queue \n3. Exit \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				stackOperations(dcl, sc);
				break;
			case 2:
				queueOperations(dcl, sc);
				break;
			case 3:
				System.out.println("\n-----------THANK YOU------------");
				break;

			default:
				System.out.println("\nWrong choice :(");
				break;
			}
		} while (choice != 3);

		sc.close();
	}

	public static void stackOperations(DoublyCircularLinkedList dcl, Scanner sc) {
		int choice = 0;
		do {
			System.out.println("\n-----------------STACK-----------------");
			System.out.println("1. Push \n2. Pop \n3. Peek \n4. Back \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter a element : ");
				dcl.addFirst(sc.next().charAt(0));
				break;
			case 2:
				dcl.deleteFirst();
				break;
			case 3:
				System.out.println(dcl.getHead().data);
				break;
			case 4:
				System.out.println("\n-----------THANK YOU------------");
				break;

			default:
				System.out.println("\nWrong choice :(");
				break;
			}
		} while (choice != 4);

	}

	public static void queueOperations(DoublyCircularLinkedList dcl, Scanner sc) {
		int choice = 0;
		do {
			System.out.println("\n-----------------QUEUE------------------");
			System.out.println("1. Push \n2. Pop \n3. Peek \n4. Back \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter a element : ");
				dcl.addFirst(sc.next().charAt(0));
				break;
			case 2:
				dcl.deleteLast();
				break;
			case 3:
				System.out.println(dcl.getHead().previous.data);
				break;
			case 4:
				System.out.println("\n-----------THANK YOU------------");
				break;

			default:
				System.out.println("\nWrong choice :(");
				break;
			}
		} while (choice != 4);
	}

}
