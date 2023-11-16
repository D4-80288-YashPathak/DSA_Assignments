package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 3, 4, -1, 7, 8, 0 };
		System.out.println(firstNonRepeatingElement(arr));
	}

	static int firstNonRepeatingElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {
						count = 1;
					}
				}
			}
			if (count == 0)
				return arr[i];
		}
		return -1;
	}

}
