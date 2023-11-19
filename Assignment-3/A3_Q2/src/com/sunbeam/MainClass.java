package com.sunbeam;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Before reversing : " + Arrays.toString(arr));
		Stack st = new Stack(arr.length);
		for (int i : arr) {
			st.push(i);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.pop();
		}
		System.out.println("\nAfter reversing : " + Arrays.toString(arr));
	}

}
