package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		DoublyCircularLinkedList dl = new DoublyCircularLinkedList();

		dl.addAtPosition('a',1);
		//dl.display();
		
		dl.addAtPosition('b',1);
		//dl.display();
		dl.addAtPosition('c',2);
		dl.addAtPosition('d',3);
		dl.addAtPosition('e',4);
		dl.addAtPosition('a',1);
		dl.display();
		
		dl.deleteAtPosition(5);
		System.out.println();
		dl.display();
	}

}
