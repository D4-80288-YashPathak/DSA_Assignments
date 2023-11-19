package com.sunbeam;

public class Stack {
	int arr[];
	int top;
	final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[size];
		top = -1;
	}

	public int push(int element) {
		arr[++top] = element;
		return element;
	}

	public void pop() {
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}
