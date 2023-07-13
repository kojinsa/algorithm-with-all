package com.example.programmers.level1;

public class Solution19 {


    public int solution(int[] absolutes, boolean[] signs) {

        int value = 0;

        for (int i = 0; i < absolutes.length; i++) {

            int n = absolutes[i];

            boolean b = signs[i];

            if (b) {
                value += n;
            } else {
                value -= n;
            }

        }

        return value;
    }

}
