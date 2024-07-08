package com.example.inflearn.section1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (isLowerCase(c)) {
                r.append((char) ((int) c - 32));
            } else if (isUpperCase(c)) {
                r.append((char) ((int) c + 32));
            } else {
                throw new RuntimeException("대문자도 소문자도 아닙니다.");
            }
        }
        System.out.println(r);
    }

    private static boolean isLowerCase(char c) {
        return (int) c >= 97 && (int) c <= 122;
    }

    private static boolean isUpperCase(char c) {
        return (int) c >= 65 && (int) c <= 90;
    }
}
