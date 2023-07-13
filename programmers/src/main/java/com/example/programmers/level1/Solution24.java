package com.example.programmers.level1;

public class Solution24 {

    public String solution(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    char temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

            }

        }

        return new String(arr);
    }
}
