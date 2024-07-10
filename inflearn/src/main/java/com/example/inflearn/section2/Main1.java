package com.example.inflearn.section2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String string = in.nextLine();
        in.close();
        int count = 0;
        int prevString1 = 0;
        for (String s : string.split(" ")) {
            if (count == 0 || prevString1 < Integer.parseInt(s)) {
                System.out.print(s + " ");
            }
            prevString1 = Integer.parseInt(s);
            count++;
        }
    }
}
