package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05I {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = scanner.nextLine();
		scanner.close();
		String output = replaceSpaces(input);
		System.out.println("Replaced String: ");
		System.out.println(output);
	}
	public static String replaceSpaces(String input) {
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (c == ' ') {
				sb.append("%20");
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
