package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 1, 5, 6 };
		int firstIndex = linearSearchFirst(arr, 1);
		if (firstIndex != -1)
			System.out.println("Last occurrence present at " + firstIndex);
		else
			System.out.println("Element not present :(");
		
		int lastIndex = linearSearchLast(arr, 1);
		if (lastIndex != -1)
			System.out.println("Last occurrence present at " + lastIndex);
		else
			System.out.println("Element not present :(");
	}

	public static int linearSearchFirst(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static int linearSearchLast(int arr[], int key) {
		int last = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				last = i;
		}
		if (last != 0)
			return last;
		return -1;
	}

}
