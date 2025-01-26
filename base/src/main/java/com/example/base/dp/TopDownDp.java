package com.example.base.dp;

import java.util.HashMap;
import java.util.Map;

public class TopDownDp {

	private static Map<Integer, Long> memo = new HashMap<>();

	public static void main(String[] args) {
		long r = fib1(50);
		System.out.println("Fibonacci(50) : " + r);
	}

	public static long fib1(int n) {
		if (n <= 1) {
			return 1;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		long result = fib1(n - 1) + fib1(n - 2); //재귀호출
		memo.put(n, result);
		return result;
	}
}
