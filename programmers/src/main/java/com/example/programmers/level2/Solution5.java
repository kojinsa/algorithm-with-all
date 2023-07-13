package com.example.programmers.level2;

public class Solution5 {

    public int[] solution(String s) {

        int zeroCount = 0;
        int loopCount = 0;

        String value = s;

        // O(log n) * 반복 횟수
        while (!"1".equals(value)) {

            String temp = value;

            // 제거해야할 0 의 수
            int n = 0;

            for (char c : temp.toCharArray()) {
                if ('0' == c) {
                    n++;
                }
            }

            int tempNotZeroSize = temp.length() - n;

            value = Integer.toBinaryString(tempNotZeroSize);

            zeroCount += n;
            loopCount++;
        }


        return new int[]{loopCount, zeroCount};
    }
}
