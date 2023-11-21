package com.sunbeam;

public class CircularQueue {
	int arr[];
	int front;
	int rear;
	int count;
	final int SIZE;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[size];
		front = -1;
		rear = -1;
		count = 0;
	}

	public void enqueue(int value) {
		if (count != SIZE) {
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
			count++;
			System.out.println("Element Enqueued Suxccessfully :)");
		} else
			System.out.println("Queue is Full");

	}

	public void dequeue() {
		if (count <= 0) {
			front = (front + 1) % SIZE;
			count--;
			System.out.printf("Element %d dequeued successfully :)", arr[(front - 1) % SIZE]);
		} else
			System.out.println("Queue is empty");
	}

	public int peek() {
		if (count != 0) {
			System.out.print("\nElement at Front = ");
			return arr[front + 1];
		}
		else {
			System.out.println("Queue is Empty");
			return 0;
		}
	}
}
