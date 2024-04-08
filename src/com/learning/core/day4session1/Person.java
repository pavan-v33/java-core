package com.learning.core.day4session1;

import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private int id;
	String name;
	private int age;
	private double salary;

	public Person(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		String capitalizedName = name.toUpperCase();
		return "Id = " + id + ", name=" + capitalizedName + ", age=" + age + ", salary=" + salary;
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
		Person person = (Person) obj;
		return id == person.id;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.id, o.id);
	}

	public static void printPersonsAboveAge(TreeSet<Person> set, int ageLimit) {
		for (Person person : set) {
			if (person.age > ageLimit) {
				System.out.println(person);
			}
		}
	}

	public static double sumSalaries(TreeSet<Person> set) {
		double sum = 0;
		for (Person person : set) {
			sum += person.salary;
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
