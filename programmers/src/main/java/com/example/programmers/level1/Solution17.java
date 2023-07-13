package com.example.programmers.level1;

public class Solution17 {

    public static class Num {
        int n;
        boolean isDivisor;

        public Num(int n, boolean isDivisor) {
            this.n = n;
            this.isDivisor = isDivisor;
        }
    }

    public int[] solution(int[] arr, int divisor) {

        sort(arr);

        int count = 0;

        Num[] array = new Num[arr.length];

        int j = 0;

        for (int n : arr) {
            boolean isTrue = n % divisor == 0;
            if (isTrue) {
                count++;
            }
            array[j++] = new Num(n, isTrue);
        }

        j = 0;

        if (count == 0) return new int[]{-1};

        int[] answer = new int[count];

        for (Num a : array) {
            if (a.isDivisor) {
                answer[j++] = a.n;
            }
        }

        return answer;
    }

    public void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
