package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution35Test {

    @Test
    public void test() {

        Solution35 s = new Solution35();

        int n = s.solution(
                new int[][]{
                        {60, 50},
                        {30, 70},
                        {60, 30},
                        {80, 40}
                }
        );

        assertEquals(n, 4000);
    }
}
