package com.learning.core.day4session1;

import java.util.Hashtable;

public class D04P08L {
	public static void main(String[] args) {
		Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

		employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
		employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
		employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
		employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

		int newId = 1005;
		if (!employeeTable.containsKey(newId)) {
			employeeTable.put(newId, new Employee(newId, "Charles", "Testing", "QA Lead"));
		}

		for (Employee employee : employeeTable.values()) {
			System.out.println(employee);
		}
	}
}
