package com.learning.core.day5session1;

import java.util.Scanner;

public class D05P10A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		quickSort(arr, 0, size - 1);
		System.out.println("Quick Sort Output:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
