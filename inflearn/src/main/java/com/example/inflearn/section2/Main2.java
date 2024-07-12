package com.example.inflearn.section2;

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        String[] aArray = a.split(" ");
        String[] bArray = b.split(" ");
        for (int i = 0; i < count; i++) {
            String s = vs(Integer.parseInt(aArray[i]), Integer.parseInt(bArray[i]));
            System.out.println(s);
        }
    }

    private static String vs(int a, int b) {
        if (a == b) {
            return "D";
        } else if (a == 1 && b == 2) {
            return "B";
        } else if (a == 2 && b == 3) {
            return "B";
        } else if (a == 3 && b == 1) {
            return "B";
        } else {
            return "A";
        }
    }
}
