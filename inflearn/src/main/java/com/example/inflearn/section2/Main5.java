package com.example.inflearn.section2;

import java.util.Scanner;

public class Main5 {
    /* 소수(에라토스테네스 체) */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.close();
        int primeCount = 0;
        for (int i = 1; i <= count; i++) {
            if (isPrime(i)) primeCount++;
        }
        System.out.println(primeCount);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
