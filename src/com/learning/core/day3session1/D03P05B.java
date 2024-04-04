package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String inputString = scanner.nextLine();
		System.out.println("Enter the number of last vowels to count:");
		int n = scanner.nextInt();
		printLastNVowels(inputString, n);

		scanner.close();
	}

	private static void printLastNVowels(String str, int n) {
		String vowels = "aeiouAEIOU";
		StringBuilder foundVowels = new StringBuilder();
		for (int i = str.length() - 1; i >= 0 && foundVowels.length() < n; i--) {
			char ch = str.charAt(i);
			if (vowels.indexOf(ch) >= 0) {
				foundVowels.append(ch);
			}
		}
		if (foundVowels.length() == n) {
			System.out.println(foundVowels.reverse().toString());
		} else {
			System.out.println("Mismatch in Vowel Count");
		}
	}
}
