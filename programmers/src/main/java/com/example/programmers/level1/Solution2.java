package com.example.programmers.level1;


public class Solution2 {

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String v = s.solution(3);
        System.out.println(v);
    }
}
