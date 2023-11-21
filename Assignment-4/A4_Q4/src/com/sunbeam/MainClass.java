package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList sl = new SinglyLinearLinkedList(10);

		sl.addFirst('d');
		sl.addFirst('c');
		sl.addFirst('b');
		sl.addFirst('a');
		sl.addLast('e');
		sl.display();
		System.out.println();
		
		sl.displayReverse();
		
	}

}
