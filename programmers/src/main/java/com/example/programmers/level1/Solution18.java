package com.example.programmers.level1;

public class Solution18 {

    public int[] solution(int[] arr) {
        int size = arr.length;

        // 조건에 대한 방어 로직
        if (size <= 1) {
            return new int[]{-1};
        }

        int min = arr[0];

        for (int j : arr) {
            min = Math.min(min, j);
        }


        int[] array2 = new int[size - 1];

        int array2Index = 0;

        for (int j : arr) {
            if (min != j) {
                array2[array2Index++] = j;
            }
        }


        return array2;
    }


}
