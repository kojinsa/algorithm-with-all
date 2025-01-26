package com.example.base.dp;

public class BottomUpDp {

	public static void main(String[] args) {
		long r = fib(50);
		System.out.println("Fibonacci(50) : " + r);
	}

	public static long fib(int n) {
		if (n <= 1)
			return n;
		long[] dp = new long[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
