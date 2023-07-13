package com.example.programmers.level1;

import java.util.Scanner;

public class Solution29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 5;

        int b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
