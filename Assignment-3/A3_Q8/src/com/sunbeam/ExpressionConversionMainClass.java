package com.sunbeam;

public class ExpressionConversionMainClass {
	public static int priority(char opr) {
		switch (opr) {
		case '^':
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
		Stack st = new Stack(30);

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

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		System.out.println("Prefix = " + infixToPrefix(infix));
	}

}
