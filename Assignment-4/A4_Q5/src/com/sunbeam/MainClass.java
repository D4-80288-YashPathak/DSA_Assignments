//5. Write a function which will insert values in sorted order into linked list.

package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList sl = new SinglyLinearLinkedList(10);

		sl.insertInSortedOrder('b');
		sl.insertInSortedOrder('d');
		sl.insertInSortedOrder('a');
		sl.insertInSortedOrder('c');
		sl.insertInSortedOrder('e');
		sl.insertInSortedOrder('z');
		sl.insertInSortedOrder('p');
		sl.insertInSortedOrder('q');
		sl.insertInSortedOrder('m');
		sl.display();
	}

}
