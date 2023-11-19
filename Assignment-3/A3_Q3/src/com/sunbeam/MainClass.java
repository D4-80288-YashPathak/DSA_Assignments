package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of queue you want : ");
		LinearQueue lq = new LinearQueue(sc.nextInt());

		do {
			System.out.println("\n------------DESC-STACK-----------");
			System.out.printf("\n1. Push \n2. Pop \n3. Peek \n4. Exit \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!lq.isFull()) {
					System.out.print("\nEnter element : ");
					lq.push(sc.nextInt());
					System.out.println("Element pushed successfully :)");
				} else {
					System.out.println("\nStack is full :(");
				}

				break;
			case 2:
				if (!lq.isEmpty()) {
					System.out.println("\nElement popped successfully :)");
					lq.pop();
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;
			case 3:
				if (!lq.isEmpty()) {
					System.out.println("\nElement at top : " + lq.peek());
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;
			case 4:
				System.out.println("THANK YOU :)");
			default:
				System.out.println("\nWrong choice :(");
				break;
			}

		} while (choice != 4);
		sc.close();
	}

}