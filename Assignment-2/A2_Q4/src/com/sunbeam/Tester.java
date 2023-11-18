package com.sunbeam;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		DescStack dst = new DescStack(5);

		do {
			System.out.println("\n------------DESC-STACK-----------");
			System.out.printf("\n1. Push \n2. Pop \n3. Peek \n4. Exit \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!dst.isFull()) {
					System.out.print("\nEnter element : ");
					dst.push(sc.nextInt());
					System.out.println("Element pushed successfully :)");
				} else {
					System.out.println("\nStack is full :(");
				}

				break;
			case 2:
				if (!dst.isEmpty()) {
					System.out.println("\nElement popped successfully :)");
					dst.pop();
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;
			case 3:
				if (!dst.isEmpty()) {
					System.out.println("\nElement at top : " + dst.peek());
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;

			default:
				System.out.println("\nWrong choice :(");
				break;
			}

		} while (choice != 4);
		sc.close();
	}

}
