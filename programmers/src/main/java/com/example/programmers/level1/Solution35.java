package com.example.programmers.level1;

public class Solution35 {

    public int solution(int[][] sizes) {

        int maxN = 0;
        int maxM = 0;

        for (int[] sizeArray : sizes) {

            int n = sizeArray[0];
            int m = sizeArray[1];

            int max = Math.max(n, m);
            int min = Math.min(n, m);

            if (max >= maxN) maxN = max;
            if (min >= maxM) maxM = min;
        }

        return maxN * maxM;
    }
}
