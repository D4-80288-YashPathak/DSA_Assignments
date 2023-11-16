package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 65, 65, 34, 421, 12, 21 };
		System.out.print("Before Sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int count = selectionSort(arr);
		System.out.print("After Sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nNumber of comparisons = " + count);

	}

	static int selectionSort(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				count += 1;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return count;
	}

}
