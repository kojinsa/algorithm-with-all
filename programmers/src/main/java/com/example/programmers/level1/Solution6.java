package com.example.programmers.level1;

public class Solution6 {

    public long solution(long n) {
        double d = Math.sqrt(n);
        if (d % 1 > 0) {
            return -1;
        }
        int value = (int) (d + 1);
        return (long) value * value;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        s.solution(3);
    }
}
