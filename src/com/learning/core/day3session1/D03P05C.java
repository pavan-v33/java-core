package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05C {
	private static void printsubCombinations(String str, String curr, int index) {
		if (index == str.length()) {
			System.out.print(curr + " ");
			return;
		}
		printsubCombinations(str, curr + str.charAt(index), index + 1);
		printsubCombinations(str, curr, index + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = scanner.next();
		System.out.println("SubCombinations for the string are: ");
		printsubCombinations(input, "", 0);
		scanner.close();
	}
}