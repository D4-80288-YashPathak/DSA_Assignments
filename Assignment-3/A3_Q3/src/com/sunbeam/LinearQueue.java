package com.sunbeam;

public class LinearQueue {
	int arr[];
	final int SIZE;
	int front;
	int rear;

	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[size];
		front = 0;
		rear = 0;
	}

	public void push(int element) {
		arr[rear++] = element;
	}

	public void pop() {
		front++;
	}

	public int peek() {
		return arr[front];
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == SIZE;
	}

}
