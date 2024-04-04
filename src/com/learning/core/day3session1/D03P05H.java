package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05H {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scanner.nextLine();
		scanner.close();
		boolean canBeSplit = checkSplit(input);
		if (canBeSplit) {
			System.out.println("Yes it can be splited");
		} else {
			System.out.println("No can't split");
		}
	}

	public static boolean checkSplit(String input) {
		int len = input.length();
		for (int i = 1; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					String s1 = input.substring(0, i);
					String s2 = input.substring(i, j);
					String s3 = input.substring(j, k);
					String s4 = input.substring(k, len);
					if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4) && !s2.equals(s3) && !s2.equals(s4)
							&& !s3.equals(s4)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
