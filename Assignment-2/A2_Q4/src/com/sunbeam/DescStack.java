package com.sunbeam;

public class DescStack {
	int[] arr;
	int top;
	final int SIZE;

	public DescStack(int size) {
		SIZE = size;
		top = size;
		arr = new int[size];
	}

	public void push(int element) {
		top = top - 1;
		arr[top] = element;
	}

	public void pop() {
		top++;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == SIZE;
	}

	public boolean isFull() {
		return top == 0;
	}
}
