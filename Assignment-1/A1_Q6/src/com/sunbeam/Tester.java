package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		int occurence = 0;
		int arr[] = { 2, 5, 7, 2, 8, 4, 7, 0, 3, 2, 1, 4, 6, 8, 4, 3 };
		System.out.println(linearSearch(arr, 2, 3));
	}

	static int linearSearch(int[] arr, int key, int occurrence) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count += 1;
				if (count == occurrence)
					return i;
			}
		}
		return -1;
	}
}
