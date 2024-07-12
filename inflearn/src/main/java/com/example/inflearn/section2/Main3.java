package com.example.inflearn.section2;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input < 3 || input > 45) {
            throw new RuntimeException();
        }
        in.close();
        for (int i = 0; i < input; i++) {
            System.out.println(fibo(i));
        }
    }

    private static int fibo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }
}
