package com.example.inflearn.section1;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String string = in.nextLine();
        in.close();

        int count = 0;
        int start = 0;
        int end = 7;
        while (count < n) {
            String s = string.substring(start, end);
            System.out.print(alpah(convert2(covert10(s))));
            start += 7;
            end += 7;
            count++;
        }
    }

    private static String covert10(String s) {
        return s
                .replaceAll("[^#]", "0")
                .replaceAll("#", "1");
    }

    private static String convert2(String s) {
        return String.valueOf(Integer.parseInt(s, 2));
    }

    private static char alpah(String s) {
        return (char) Integer.parseInt(s);
    }
}
