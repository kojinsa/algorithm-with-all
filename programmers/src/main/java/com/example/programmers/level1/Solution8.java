package com.example.programmers.level1;

public class Solution8 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 0;
        long start = x;
        while (count != n) {
            answer[count++] = start;
            start += x;
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution8 s = new Solution8();

        s.solution(-4, 2);

        //2,4,6,8,10
    }
}
