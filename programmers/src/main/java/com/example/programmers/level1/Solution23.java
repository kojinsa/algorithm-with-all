package com.example.programmers.level1;

public class Solution23 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int size = a.length;
        for (int i = 0; i < size; i++) {
            answer += (a[i] * b[i]);
        }
        return answer;
    }

}
