package com.example.codility.lesson3;

public class Solution1 {

    public int solution(int X, int Y, int D) {

        int desc = Y - X;

        if (desc <= 0) return 0;

        return (int) Math.ceil((desc / (double) D));
    }
}
