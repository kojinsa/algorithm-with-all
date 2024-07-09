package com.example.inflearn.section1;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        boolean[] alphabet = new boolean[1000];
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        if (str.length() > 100) {
            throw new RuntimeException("100자리 초과 금지!");
        }
        StringBuilder s = new StringBuilder();
        for (char c : str.toCharArray()) {
            int n = (int) c;
            if (!alphabet[n]) {
                s.append(c);
                alphabet[n] = true;
            }
        }
        System.out.println(s);
    }
}
