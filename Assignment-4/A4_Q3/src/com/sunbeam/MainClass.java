package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList sl = new SinglyLinearLinkedList(4);

		sl.addFirst('e');
		sl.addFirst('c');
		sl.addFirst('b');
		sl.addFirst('a');
		sl.addLast('f');
		sl.display();
		System.out.println();

//		sl.insertAfterNode(3, 'd');
//		sl.display();
		sl.insertBeforeNode(4, 'd');
		sl.display();
	}

}
