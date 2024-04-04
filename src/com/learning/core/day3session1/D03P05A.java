package com.learning.core.day3session1;

import java.util.Scanner;

public class D03P05A {
	public static void main(String[] args) {
		String instr;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		instr = s.nextLine();
		System.out.println("Length of the String: " + instr.length());
		String upper = instr.toUpperCase();
		System.out.println("String in upperCase: " + upper);

		if (isPalindrome(instr)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}
		s.close();
	}

	private static boolean isPalindrome(String str) {
		String lowstr = str.toLowerCase();
		int i = 0;
		int j = lowstr.length()-1;
		while (i < j) {
			if (lowstr.charAt(i) != lowstr.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
