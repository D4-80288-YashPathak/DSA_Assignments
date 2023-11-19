package com.sunbeam;

public class ExpressionConversionMainClass {
	public static int priority(char opr) {
		switch (opr) {
		case '$':
			return 3;
		case '*':
			return 2;
		case '%':
			return 2;
		case '/':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		default:
			return 0;
		}

	}

	public static String infixToPrefix(String infix) {
		Stack st = new Stack(10);

		StringBuilder prefix = new StringBuilder();

		for (int i = infix.length() - 1; i > -1; i--) {
			char ch = infix.charAt(i);
			if (Character.isDigit(ch)) {
				prefix.append(ch);
			} else if (ch == ')')
				st.push(ch);
			else if (ch == '(') {
				while (st.peek() != ')')
					prefix.append(st.pop());
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) > priority(ch)) {
					prefix.append(st.pop());
				}
				st.push(ch);
			}
		}

		while (!st.isEmpty())
			prefix.append(st.pop());

		prefix.reverse();

		return prefix.toString();
	}

	public static String infixToPostfix(String infix) {
		Stack st = new Stack(10);

		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < infix.length(); i++) {
			char element = infix.charAt(i);

			if (Character.isDigit(element))
				postfix.append(element);
			else if (element == '(')
				st.push(element);
			else if (element == ')') {
				while (st.peek() != '(')
					postfix.append(st.pop());
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) >= priority(element))
					postfix.append(st.pop());
				st.push(element);
			}

		}

		while (!st.isEmpty())
			postfix.append(st.pop());

		return postfix.toString();
	}

	public static String multiDigitInfixToPrefix(String infix) {

		Stack st = new Stack(20);
		String temp = "";

		StringBuilder prefix = new StringBuilder();

		for (int i = infix.length() - 1; i > -1; i--) {
			char ch = infix.charAt(i);

			if (i == 0)
				temp += ch;

			if (ch == ' ' || i == 0) {
				if (temp != "")
					prefix.append(temp);
				temp = "";
			} else if (Character.isDigit(ch)) {
				temp += ch;
			} else if (ch == ')')
				st.push(ch);
			else if (ch == '(') {
				while (st.peek() != ')')
					prefix.append(st.pop());
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) > priority(ch)) {
					prefix.append(st.pop());
				}
				st.push(ch);
			}
		}

		while (!st.isEmpty())
			prefix.append(st.pop());

		return prefix.reverse().toString();

	}

	public static String multiDigitInfixToPostfix(String infix) {
		Stack st = new Stack(20);
		StringBuilder postfix = new StringBuilder();
		String temp = "";
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);

			if (i == (infix.length() - 1))
				temp += ch;
			if (ch == ' ' || i == infix.length() - 1) {
				if (temp != "")
					postfix.append(temp);
				temp = "";
			} else if (Character.isDigit(ch)) {
				temp += ch;
			} else if (ch == '(')
				st.push(ch);
			else if (ch == ')') {
				while (st.peek() != '(')
					postfix.append(st.pop());
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) > priority(ch)) {
					postfix.append(st.pop());
				}
				st.push(ch);
			}
		}
		while (!st.isEmpty())
			postfix.append(st.pop());

		return postfix.toString();
	}

	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";
		String multiDigitInfix = "10 $ 90 + 30 * 40 - ( 60 + 80 / 20 ) + 70";

		System.out.println("Prefix = " + infixToPrefix(infix));
		System.out.println("Postfix = " + infixToPostfix(infix));
		System.out.println(multiDigitInfixToPrefix(multiDigitInfix));
		System.out.println(multiDigitInfixToPostfix(multiDigitInfix));
	}

}
