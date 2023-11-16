// 3. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach

package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 7;
		System.out.println(linearSearchComparisons(arr, key));
		System.out.println(binarySearchComparisons(arr, key));
	}

	static int linearSearchComparisons(int[] arr, int key1) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += 1;
			if (arr[i] == key1)
				return count;
		}
		return -1;
	}

	static int binarySearchComparisons(int[] arr, int key2) {
		int left = 0;
		int right = arr.length - 1;
		int count = 0;

		while (left <= right) {
			count += 1;
			int mid = (left + right) / 2;
			if (key2 == arr[mid])
				return mid;
			else if (key2 < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
