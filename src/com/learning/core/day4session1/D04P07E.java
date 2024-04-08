package com.learning.core.day4session1;

import java.util.*;

public class D04P07E {
	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(1, "Alice", 22, 1500.0));
		personSet.add(new Person(2, "Bob", 30, 2500.0));
		personSet.add(new Person(3, "Charlie", 28, 1800.0));
		personSet.add(new Person(4, "David", 25, 2000.0));
		personSet.add(new Person(5, "John", 32, 1999.0));
		personSet.add(new Person(6, "Tom", 42, 3999.0));

		System.out.println("Persons details whose age is greater than 40:");
		Person.printPersonsAboveAge(personSet, 40);
	}
}
