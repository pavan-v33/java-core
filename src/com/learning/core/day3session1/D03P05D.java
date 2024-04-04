package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = scanner.next();
		System.out.println("Output is: " + minDeletions(str));
		scanner.close();
	}

	public static int minDeletions(String s) {
		int lps = longestPalindromicSubsequenceLength(s);
		return s.length() - lps;
	}

	private static int longestPalindromicSubsequenceLength(String s) {
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();

		int n = s.length();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (s.charAt(i - 1) == reversed.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[n][n];
	}
}
