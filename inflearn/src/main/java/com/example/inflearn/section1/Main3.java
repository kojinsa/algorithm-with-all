package com.example.inflearn.section1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if (s.length() > 100) {
            throw new RuntimeException("길이가 100을 넘어가면 안됩니다.");
        }

        System.out.println(solution(s));
    }

    private static String solution(String str) {
        String a = "";
        int m = Integer.MIN_VALUE;
        String[] array = str.split(" ");
        for (String x : array) {
            int len = x.length();
            if (len > m) {
                m = len;
                a = x;
            }
        }
        return a;
    }
}
