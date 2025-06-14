package com.example.leetcode.datastructures.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] index = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int n = nums[i];
				int m = nums[j];

				if (n + m == target) {
					index[0] = i;
					index[1] = j;
				}
			}
		}

		return index;
	}
}
