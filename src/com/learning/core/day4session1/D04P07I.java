package com.learning.core.day4session1;

import java.util.TreeSet;
public class D04P07I {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "Alice", 22, 1500.0));
        personSet.add(new Person(2, "Bob", 30, 2500.0));
        personSet.add(new Person(3, "Charlie", 28, 1800.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Cherry", 42, 3999.0));
        boolean found = false;
        System.out.println("Output: ");
        for (Person person : personSet) {
            if (person.getName().startsWith("Z")) {
                System.out.println(person);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name does not exist.");
        }
    }
}