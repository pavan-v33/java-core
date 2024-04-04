package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05E {

	public static boolean canFormCircle(String[] words) {
		if (words == null || words.length == 0) {
			return false;
		}
		return backtrack(words, words[0], 1);
	}

	private static boolean backtrack(String[] words, String current, int count) {
		if (count == words.length) {
			return current.charAt(current.length() - 1) == words[0].charAt(0);
		}
		for (int i = 0; i < words.length; i++) {
			if (words[i] != null && current.charAt(current.length() - 1) == words[i].charAt(0)) {
				String nextWord = words[i];
				words[i] = null;
				if (backtrack(words, nextWord, count + 1)) {
					return true;
				}
				words[i] = nextWord;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of strings:");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the strings:");
		scanner.close();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Output: ");
		if (canFormCircle(words)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
