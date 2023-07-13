package com.example.programmers.level1;

public class Solution28 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int size = arr1.length;
        int size2 = arr1[0].length;

        int[][] answer = new int[size][size2];

        for (int i = 0; i < size; i++) {
            int[] temp = new int[size2];
            for (int j = 0; j < size2; j++) {
                int n = arr1[i][j];
                int m = arr2[i][j];
                int sum = n + m;
                temp[j] = sum;
            }

            answer[i] = temp;
        }

        return answer;
    }
}
