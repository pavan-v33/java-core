package com.learning.core.day5session1;

import java.util.Scanner;

public class D05P10C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int size = scanner.nextInt();
		System.out.println("Enter the input elements: ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Element to be searched: ");
		int key = scanner.nextInt();
		boolean found = false;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is not Present");
		}
		scanner.close();
	}
}
