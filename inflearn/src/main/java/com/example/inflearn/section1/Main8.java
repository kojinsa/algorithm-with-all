package com.example.inflearn.section1;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        System.out.println(solution(str));
    }

    private static String solution(String s) {
        // 알파벳 제외 모두 소거
        String result2 = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charArray = result2.toCharArray();
        int rt = 0, lt = charArray.length - 1;
        String result = charArray.length <= 1 ? "NO" : "YES";
        while (rt < lt) {

            char rtChar = charArray[rt];
            char ltChar = charArray[lt];

            if (rtChar == ltChar) {
                rt++;
                lt--;
            } else {
                result = "NO";
                break;
            }

        }

        return result;
    }
}
