package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03E {
	public static void main(String args[]) {
		int i, fact = 1;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}