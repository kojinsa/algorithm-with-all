package com.example.leetcode.datastructures.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/degree-of-an-array/?utm_source=chatgpt.com
 */
public class DegreeOfAnArray {

	public static void main(String[] args) {
		final int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
		int result = findShortestSubArray(nums);
		System.out.println(result);
	}

	public static int findShortestSubArray(int[] nums) {

		Map<Integer, Integer> countMap = new HashMap<>();
		Map<Integer, Integer> firstIndexMap = new HashMap<>();
		Map<Integer, Integer> lastIndexMap = new HashMap<>();

		int degree = 0;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
			firstIndexMap.putIfAbsent(num, i);
			lastIndexMap.put(num, i);

			degree = Math.max(degree, countMap.get(num));
		}

		int minLength = nums.length;
		for (int num : countMap.keySet()) {
			if (countMap.get(num) == degree) {
				int length = lastIndexMap.get(num) - firstIndexMap.get(num) + 1;
				minLength = Math.min(minLength, length);
			}
		}

		return minLength;
	}
}
