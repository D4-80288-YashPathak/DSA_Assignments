package com.sunbeam;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		Employee employees[] = new Employee[5];

		employees[0] = new Employee(1, "Yash", 2000);
		employees[1] = new Employee(2, "Rohit", 6000);
		employees[2] = new Employee(3, "Darshan", 8000);
		employees[3] = new Employee(4, "Vedant", 1000);
		employees[4] = new Employee(5, "Porus", 4000);
		
		System.out.println("Before Sort ----> \n"+Arrays.toString(employees));
		
		sortEmployeesBySalary(employees);
		
		System.out.println("After Sort ----> \n"+Arrays.toString(employees));

	}

	public static void sortEmployeesBySalary(Employee[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Employee temp = arr[i];
			int j;
			for (j = i - 1; j > -1 && arr[j].salary > temp.getSalary(); j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
}
