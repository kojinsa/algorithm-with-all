package com.example.programmers.level1;


// todo : level1 package 로 이동 할 것
public class Solution {

    public double solution(int[] arr) {

        int size = arr.length;

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        return sum / (double) size;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        double v = s.solution(new int[]{1, 2, 3, 4});

        System.out.println("result : " + v);
    }
}
