package com.learning.core.day4session1;

import java.util.Objects;

class Employee {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee(int id, String name, String department, String designation) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + designation + " " + department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return id == employee.id;
	}
}
