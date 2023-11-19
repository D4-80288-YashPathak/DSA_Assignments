package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int choice = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack(5);

		do {
			System.out.println("\n------------DESC-STACK-----------");
			System.out
					.printf("\n1. Push \n2. Pop \n3. Peek \n4. Show Maximum element \n5. Exit \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!st.isFull()) {
					System.out.print("\nEnter element : ");
					int x = st.push(sc.nextInt());
					if (x > max)
						max = x;
					System.out.println("Element pushed successfully :)");
				} else {
					System.out.println("\nStack is full :(");
				}

				break;
			case 2:
				if (!st.isEmpty()) {
					System.out.println("\nElement popped successfully :)");
					st.pop();
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;
			case 3:
				if (!st.isEmpty()) {
					System.out.println("\nElement at top : " + st.peek());
				} else {
					System.out.println("\nStack is empty :(");
				}

				break;
			case 4:
				if (!st.isEmpty()) {
					System.out.println("\nMaximum = " + max);
					st.pop();
				} else {
					System.out.println("\nStack is empty :(");
				}
				break;
			default:
				System.out.println("\nWrong choice :(");
				break;
			}

		} while (choice != 5);
		sc.close();
	}

}