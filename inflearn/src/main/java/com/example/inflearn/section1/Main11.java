package com.example.inflearn.section1;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        in.close();
        char[] charArray = string.toCharArray();
        char preString = charArray[0];
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == preString) {
                count++;
            } else {
                sb.append(preString);
                if (count != 1) {
                    sb.append(count);
                }
                preString = c;
                count = 1;
            }

            if (i == charArray.length - 1) {
                sb.append(preString);
                if (count != 1) {
                    sb.append(count);
                }
            }
        }
        System.out.println(sb);
    }
}
