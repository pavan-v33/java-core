package com.learning.core.day4session1;

import java.util.*;

public class D04P07G {
	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(1, "Jerry", 25, 999.0));
		personSet.add(new Person(2, "Smith", 35, 2999.0));
		personSet.add(new Person(3, "Popeye", 45, 5999.0));
		personSet.add(new Person(4, "Jones", 40, 6999.0));
		personSet.add(new Person(5, "John", 32, 1999.0));
		personSet.add(new Person(6, "Tom", 42, 3999.0));

		for (Person person : personSet) {
			System.out.println(person);
		}
	}
}
