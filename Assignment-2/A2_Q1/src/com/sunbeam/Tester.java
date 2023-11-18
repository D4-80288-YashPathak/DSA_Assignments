//1. Write a insertion sort function to sort array and returns no of comparisions.

package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static int insertionSort(int[] arr) {
		int temp;
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j;
			for (j = i - 1; j > -1 && arr[j] > temp; j--) {
				count++;
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 55, 44, 22, 66, 11, 33 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		int count = insertionSort(arr);
		System.out.println("\nAfter Sorting : " + Arrays.toString(arr));
		System.out.println("\nNumber of comaparisons = " + count);
	}

}
