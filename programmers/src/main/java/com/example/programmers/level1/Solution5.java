package com.example.programmers.level1;

public class Solution5 {

    public int[] solution(long n) {

        String[] v = String.valueOf(n).split("");

        int size = v.length;

        int[] answer = new int[size];

        int start = size - 1;

        int index = 0;

        for (int i = start; i >= 0; i--) {
            answer[index++] = Integer.valueOf(v[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        Solution5 s = new Solution5();

        int[] a = s.solution(12345);
    }
}
