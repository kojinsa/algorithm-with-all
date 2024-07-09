package com.example.inflearn.section1;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String target = in.next();
        in.close();

        int[] answer = new int[str.length()];

        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.toCharArray()[0]) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for (int i = str.length() - 1; i > -1; i--) {
            if (str.charAt(i) == target.toCharArray()[0]) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(p, answer[i]);
            }
        }

        for (int n : answer) {
            System.out.print(n + " ");
        }
    }

}
