package com.example.inflearn.section2;

import java.util.Scanner;

public class Main7 {

    private static final String OK = "1";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String a = in.nextLine();
        in.close();
        int n = 0;
        int currentCount = 0;
        for (String s : a.split(" ")) {
            if (OK.equals(s)) {
                currentCount += (n += 1);
            } else {
                currentCount += (n = 0);
            }
        }
        System.out.println(currentCount);
    }
}
