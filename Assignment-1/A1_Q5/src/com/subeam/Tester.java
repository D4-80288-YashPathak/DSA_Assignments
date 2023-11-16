package com.subeam;

import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 6, 5, 3, 2, 1 };
		System.out.println(binarySearchDesc(arr, 2));

	}

	static int binarySearchDesc(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;

		while (!(right < left)) {
			int mid = (left + right) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1;
	}

}
