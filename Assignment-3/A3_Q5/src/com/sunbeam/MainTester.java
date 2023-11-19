package com.sunbeam;

public class MainTester {

	public static int calculate(int op1, int op2, char opr) {

		switch (opr) {
		case '+':

			return op1 + op2;
		case '-':

			return op1 - op2;
		case '*':

			return op1 * op2;
		case '/':

			return op1 / op2;
		case '%':

			return op1 % op2;
		case '$':

			return (int) Math.pow(op1, op2);

		}
		return 0;
	}

	public static int evaluatePrefix(String preFix) {
		Stack st = new Stack(10);

		for (int i = preFix.length() - 1; i > -1; i--) {
			char element = preFix.charAt(i);

			if (Character.isDigit(element)) {
				st.push(element - '0');
			} else {
				int op1 = st.pop();
				int op2 = st.pop();

				int result = calculate(op1, op2, element);
				st.push(result);

			}
		}
		if (!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static int evaluatePostFix(String postFix) {
		Stack st = new Stack(10);

		for (int i = 0; i < postFix.length(); i++) {

			char element = postFix.charAt(i);

			if (Character.isDigit(element)) {

				st.push(element - '0');
			} else {
				int op2 = st.pop();
				int op1 = st.pop();

				int result = calculate(op1, op2, element);
				st.push(result);
			}

		}

		if (!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static int evaluateMultiPrefix(String multiPrefix) {

		Stack st = new Stack(10);

		String temp = "";

		for (int i = multiPrefix.length() - 1; i > -1; i--) {

			char ch = multiPrefix.charAt(i);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (ch == ' ') {
				if (temp != "")
					st.push(Integer.parseInt(temp));
				temp = "";
			} else {
				int op1 = st.pop();
				int op2 = st.pop();

				int result = calculate(op1, op2, ch);
				st.push(result);
			}
		}

		if (!st.isEmpty())
			return st.pop();

		return 0;
	}

	public static int evaluateMultiPostFix(String postFix) {
		Stack st = new Stack(10);

		String temp = "";

		for (int i = 0; i < postFix.length(); i++) {

			char element = postFix.charAt(i);

			if (Character.isDigit(element)) {
				temp = temp + element;
				// System.out.println(temp);
			} else if (element == ' ') {
				if (temp != "")
					st.push(Integer.parseInt(temp));
				temp = "";
			} else {
				int op2 = st.pop();
				int op1 = st.pop();

				int result = calculate(op1, op2, element);
				st.push(result);
			}

		}

		if (!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static void main(String[] args) {
		String postFix = "456*3/+9+7-";
		String multiDigitPostFix = "40 50 60 * 30 / + 90 + 70 -";

		System.out.println("Postfix = " + evaluatePostFix(postFix));
		System.out.println("Multi-Digit Postfix = " + evaluateMultiPostFix(multiDigitPostFix));

		String prefix = "-++4/*56397";
		String multiPrefix = "- + + 40 / * 50 60 30 90 70";

		System.out.println("Prefix = " + evaluatePrefix(prefix));
		System.out.println("Multi-Digit Prefix = " + evaluateMultiPrefix(multiPrefix));
	}

}
