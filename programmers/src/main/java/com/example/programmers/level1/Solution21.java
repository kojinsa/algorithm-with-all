package com.example.programmers.level1;

public class Solution21 {

    public String solution(String s) {

        int size = s.length();

        int start = size % 2 == 0 ? (size / 2) - 1 : (size / 2);

        int end = (size / 2) + 1;

        return s.substring(start, end);
    }
}
