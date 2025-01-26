package com.example.leetcode.dp;

/**
 * https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming
 */
public class ClimbStairsMain {

	public static int climbStairs(int n) {
		int[] array = new int[n + 1];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[n];
	}

	public static void main(String[] args) {
		Integer r = climbStairs(2);
		System.out.println(r);
	}
}
