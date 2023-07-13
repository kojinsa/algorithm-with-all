package com.example.programmers.level1;

public class Solution10 {

    public boolean solution(int x) {

        String[] sArray = String.valueOf(x).split("");

        int sum = 0;

        for (String s : sArray) {
            sum += Integer.valueOf(s);
        }

        return x % sum == 0;
    }

}
