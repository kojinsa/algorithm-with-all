package com.example.inflearn.section1;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String[] array = new String[input1];

        for (int i = 0; i < array.length; i++) {
            array[i] = solution1(in.next());
        }

        for (String s : array) {
            System.out.println(s);
        }
    }

    private static String solution1(String s) {
        char[] chars = s.toCharArray();
        int lt = 0, rt = chars.length - 1;
        while (lt < rt) {
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }
        return String.valueOf(chars);
    }
}
