//5. Write a function which will insert values in sorted order into linked list.

package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList sl = new SinglyLinearLinkedList();

//		sl.insertInSortedOrder(new Employee(4, "Yash", 1000));
//		sl.insertInSortedOrder(new Employee(3, "Rohit", 2000));
//		sl.insertInSortedOrder(new Employee(2, "Porus", 3000));
//		sl.insertInSortedOrder(new Employee(5, "Darshan", 4000));
//		sl.insertInSortedOrder(new Employee(1, "Sanket", 7000));
//
//		sl.display();

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\n-----------------MENU----------------");
			System.out.println("1. Add Employee. \n2. Display All Employees \n3. Search Employee by Name"
					+ "\n4. Delete Employee by ID \n5. Update Salary of Employee \n6. Exit\nEnter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\nEnter ID : ");
				int id = sc.nextInt();
				System.out.println("\nEnter Name : ");
				String name = sc.next();
				System.out.println("\nEnter Salary : ");
				double salary = sc.nextDouble();

				sl.insertInSortedOrder(new Employee(id, name, salary));
				System.out.println("\nEmployee inserted successfully :)");
				break;
			case 2:
				if (!sl.isEmpty())
					sl.display();
				else
					System.out.println("\nList is Empty :(");

				break;
			case 3:
				System.out.print("\nEnter the Name of employee you want to search : ");
				name = sc.next();
				if (sl.searchByName(name)) {
					System.out.println("\nEmployee Present in List :)");
				} else
					System.out.println("\nEmployee not present in List :(");

				break;

			case 4:
				System.out.println("\nEnter the Employee you want to delete : ");
				sl.deleteEmployeeById(sc.nextInt());

				break;
			case 5:
				System.out.println("\nEnter the id of Employee : ");
				sl.updateSalary(sc.nextInt(), sc);
				break;
			case 6:
				System.out.println("\n----------THANK YOU-----------");
				break;

			default:
				System.out.println("\nWrong choice :(");
				break;
			}

		} while (choice != 6);

		sc.close();
	}

}
