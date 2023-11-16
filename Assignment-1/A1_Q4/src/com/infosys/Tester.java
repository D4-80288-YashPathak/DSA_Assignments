package com.infosys;

public class Tester {

	public static void main(String[] args) {

		Employee arr[] = new Employee[5];
		arr[0] = new Employee(1, "Yash", 1000.10);
		arr[1] = new Employee(2, "Rohit", 7000.60);
		arr[2] = new Employee(3, "Lakshya", 6700);
		arr[3] = new Employee(4, "Prateek", 4000.10);
		arr[4] = new Employee(5, "Meet", 2000.40);

		Employee search = searchByEmpId(arr, 3);
		if (search != null) {
			System.out.println("\nEmployee Found :) Details ---> ");
			System.out.print(search.toString());
		}

		else
			System.out.println("\nEmployee not found :(");

		search = searchByEmpName(arr, "Meet");
		if (search != null) {
			System.out.println("\nEmployee Found :) Details ---> ");
			System.out.print(search.toString());
		}

		else
			System.out.println("\nEmployee not found :(");

		search = searchByEmpSalary(arr, 4000.10);
		if (search != null) {
			System.out.println("\nEmployee Found :) Details ---> ");
			System.out.print(search.toString());
		}

		else
			System.out.println("\nEmployee not found :(");

	}

	static Employee searchByEmpId(Employee arr[], int id) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getEmpId() == id)
				return arr[i];
		}
		return null;
	}

	static Employee searchByEmpName(Employee arr[], String name) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName() == name)
				return arr[i];
		}
		return null;
	}

	static Employee searchByEmpSalary(Employee arr[], double salary) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getSalary() == salary)
				return arr[i];
		}
		return null;
	}

}
