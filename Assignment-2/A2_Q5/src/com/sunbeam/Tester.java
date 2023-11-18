package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an operator to know its priority : ");
		char ch = sc.next().charAt(0);

		int priority = priority(ch);
		if (priority(ch) == 0)
			System.out.println("It is not an operator :(");
		else
			System.out.println("\nThe priority of " + ch + " is " + priority(ch));
	}

	public static int priority(char ch) {
		switch (ch) {
		case '+':
			return 3;
		case '-':

			return 3;

		case '*':

			return 2;

		case '/':

			return 2;

		case '%':

			return 2;

		case '$':

			return 1;

		default:
			return 0;
		}
	}

}
