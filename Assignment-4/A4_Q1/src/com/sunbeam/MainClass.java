package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList sl = new SinglyLinearLinkedList(4);
		
		sl.addFirst('d');
		sl.addFirst('c');
		sl.addFirst('b');
		sl.addFirst('a');
		sl.addLast('e');
		sl.display();
		System.out.println();
		sl.deleteFirst();
		sl.display();
		System.out.println();
		sl.deleteLast();
		sl.display();
	}

}
