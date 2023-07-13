package com.example.programmers.level1;

public class Solution20 {

    public int solution(int[] numbers) {

        boolean[] booleans = new boolean[10];

        for (int n : numbers) {
            booleans[n] = true;
        }

        int value = 0;

        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]) value += i;
        }

        return value;
    }
}
