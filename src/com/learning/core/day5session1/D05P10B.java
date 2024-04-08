package com.learning.core.day5session1;

import java.util.Scanner;

public class D05P10B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		mergeSort(arr, 0, size - 1);
		System.out.println("Merge Sort Output:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; ++i)
			left[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			right[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
