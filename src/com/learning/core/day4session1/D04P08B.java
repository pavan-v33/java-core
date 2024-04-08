package com.learning.core.day4session1;

import java.util.HashMap;
import java.util.Map;

public class D04P08B {
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
		phoneBook.put("Amal", "998787823");
		phoneBook.put("Manvitha", "937843978");
		phoneBook.put("Joseph", "7882221113");
		phoneBook.put("Smith", "8293893311");
		phoneBook.put("Kathe", "7234560011");

		String nameToSearch = "Pozhil";

		String phoneNumber = phoneBook.get(nameToSearch);

		if (phoneNumber != null) {
			System.out.println("Output: " + phoneNumber);
		} else {
			System.out.println("Output: Phone number not found for " + nameToSearch);
		}
	}
}