package com.example.inflearn.section1;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        int lt = 0, rt = str.length() - 1;
        char[] charArray = str.toLowerCase().toCharArray();
        String result = str.length() <= 1 ? "NO" : "YES";
        while (lt < rt) {
            if (charArray[lt] == charArray[rt]) {
                lt++;
                rt--;
            } else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
