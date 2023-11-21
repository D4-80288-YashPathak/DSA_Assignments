package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyCircularLinkedList scl = new SinglyCircularLinkedList();
		
		scl.addFirst(3);
		scl.addFirst(2);
		scl.addFirst(1);
		scl.addLast(5);
		scl.display();
		System.out.println();
		
//		scl.deleteFirst();
//		scl.display();
//		
//		System.out.println();
//		scl.deleteLast();
//		scl.display();
		scl.addAtPosition(4, 4);
		scl.display();
		System.out.println();
		scl.deleteFromPosition(4);
		scl.display();
		

	}

}
