package com.learning.core.day3session1;

public class D03P05G {
	public static void main(String[] args) {
		String[] dictionary = { "abb", "abc", "xyz", "xyy", "foo" };
		String pattern = "foo";

		System.out.println("Output:");
		findAndPrintMatchingStrings(dictionary, pattern);
	}

	public static void findAndPrintMatchingStrings(String[] dictionary, String pattern) {

		for (String word : dictionary) {
			if (matchesPattern(word, pattern)) {
				System.out.println(word);
			}
		}
	}

	public static boolean matchesPattern(String word, String pattern) {

		return word.length() == pattern.length() && (word + word).indexOf(pattern) != -1;
	}
}
