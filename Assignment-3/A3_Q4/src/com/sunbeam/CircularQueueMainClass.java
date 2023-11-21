package com.sunbeam;

import java.util.Scanner;

public class CircularQueueMainClass {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while (choice != 4) {
			System.out.println("------------CIRCULAR-QUEUE-------------");
			System.out.println("1.Enqueue \n2.Dequeue \n3.Peek \n4.Exit \nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter element you want to enqueue : ");
				cq.enqueue(sc.nextInt());
				break;
			case 2:
				cq.dequeue();
				break;
			case 3:
				System.out.println(cq.peek());
				break;
			case 4:
				System.out.println("THANK YOU :)");
				break;

			default:
				break;
			}
		}
		sc.close();
	}
}
