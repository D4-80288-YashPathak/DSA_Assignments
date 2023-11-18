package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] arr = { 55, 44, 22, 66, 11, 33 };
		System.out.println("Before Sort : " + Arrays.toString(arr));
		int count = insertionSortDesc(arr);
		System.out.println("\nAfter Sort : " + Arrays.toString(arr));
		System.out.println("\nNumber of Comparisons = " + count);

	}

	public static int insertionSortDesc(int arr[]) {
		int count = 0;

		for (int i = arr.length - 2; i > -1; i--) {
			int temp = arr[i];
			int j;
			for (j = i + 1; j < arr.length && arr[j] > temp; j++) {
				count++;
				arr[j - 1] = arr[j];
			}
			arr[j - 1] = temp;
		}

		return count;
	}
}
