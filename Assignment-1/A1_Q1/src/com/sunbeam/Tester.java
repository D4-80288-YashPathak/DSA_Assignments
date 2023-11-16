package com.sunbeam;

import java.util.Collection;

public class Tester {

	public static void main(String[] args) {
		char arr[] = { 'z', 'a', 'z' };

		System.out.println(checkPalindromeM1(arr));
		System.out.println(checkPalindromeM2(arr));
	}

	public static boolean checkPalindromeM1(char[] arr) {

		int end = arr.length - 1;

		for (int i = 0; i < (arr.length - 1) / 2; i++, end--) {
			if (!(arr[i] == arr[end])) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPalindromeM2(char[] arr) {
		char[] arr1 = new char[3];
		for (int i = 0, j = arr.length - 1; i < arr1.length; i++, j--) {
			arr1[i] = arr[j];
		}
		for (int i = 0; i < arr1.length; i++) {
			if (Character.compare(arr1[i], arr[i]) != 0)
				return false;
		}
		return true;
	}
}
