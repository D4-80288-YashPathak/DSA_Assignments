package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println(findRankOfElement(arr, 4));

	}

	static int findRankOfElement(int[] arr, int key) {
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= key) {
				rank++;
			}
		}
		return rank;
	}
}
