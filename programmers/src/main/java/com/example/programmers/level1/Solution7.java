package com.example.programmers.level1;

public class Solution7 {

    boolean solution(String s) {

        s = s.toLowerCase();

        int yCount = 0;

        int pCount = 0;

        for (char c : s.toCharArray()) {
            if ('p' == c) {
                pCount++;
            } else if ('y' == c) {
                yCount++;
            }
        }

        return (yCount == pCount && yCount != 0 && pCount != 0);
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        boolean b = s.solution("Pyy");
        if (b) {
            System.out.println("s");
        } else {
            System.out.println("f");
        }
    }
}
