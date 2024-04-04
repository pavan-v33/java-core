package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05F {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("User Input String: ");
		String s = scanner.nextLine();
		scanner.close();
		int result = longestPrefixSuffix(s);
		System.out.println("Length of the longest prefix and suffix: " + result);
	}

	public static int longestPrefixSuffix(String s) {
		int n = s.length();
		int maxPrefixSuffixLength = 0;
		for (int i = 1; i < n; i++) {
			if (s.substring(0, i).equals(s.substring(n - i))) {
				maxPrefixSuffixLength = i;
			}
		}

		return maxPrefixSuffixLength;
	}
}
