package com.learning.core.day4session1;

import java.util.ArrayList;
import java.util.Arrays;

public class D04P07A {
	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("pavan");
		studentList.addAll(Arrays.asList("pozhil", "gokul", "nishanth"));
		String nameToSearch = "gokul";
		if (studentList.contains(nameToSearch)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
