package com.learning.core.day2session1;

public class D02P04D {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 2;
		findCombinations(nums, k);
	}

	public static void findCombinations(int[] nums, int k) {
		int[] combination = new int[k];
		combine(nums, 0, combination, 0);
	}

	public static void combine(int[] nums, int start, int[] combination, int index) {
		if (index == combination.length) {
			for (int num : combination) {
				System.out.print(num);
			}
			System.out.print(",");
			return;
		}
		for (int i = start; i < nums.length; i++) {
			combination[index] = nums[i];
			combine(nums, i + 1, combination, index + 1);
		}
	}
}