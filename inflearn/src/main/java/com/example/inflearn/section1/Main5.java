package com.example.inflearn.section1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int rt = 0, lt = s.length() - 1;
        char[] chars = s.toCharArray();
        while (rt < lt) {

            if (isAlpah(chars[rt]) && isAlpah(chars[lt])) {
                char tmp = chars[rt];
                chars[rt] = chars[lt];
                chars[lt] = tmp;
                rt++;
                lt--;
            }

            if (!isAlpah(chars[rt])) {
                rt++;
            }

            if (!isAlpah(chars[lt])) {
                lt--;
            }
        }
        System.out.println(String.valueOf(chars));
    }

    private static boolean isAlpah(char ch) {
        return isLowerCase(ch) || isUpperCase(ch);
    }

    private static boolean isLowerCase(char c) {
        return (int) c >= 97 && (int) c <= 122;
    }

    private static boolean isUpperCase(char c) {
        return (int) c >= 65 && (int) c <= 90;
    }
}
