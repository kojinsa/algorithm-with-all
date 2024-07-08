package com.example.inflearn.section1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input1 = in.next();
        String input2 = in.next();

        // 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

        if (input1.length() > 100 || input2.length() > 100) {
            throw new RuntimeException("길이가 100이 넘었어요");
        }


        int count = 0;

        String string1 = input1.toLowerCase();
        String string2 = input2.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {

            if (string1.charAt(i) == string2.charAt(0)) {
                ++count;
            }
        }

        System.out.println(count);
        return;
    }
}
