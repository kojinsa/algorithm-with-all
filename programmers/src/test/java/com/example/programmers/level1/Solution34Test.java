package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution34Test {

    @Test
    public void test1() {

        Solution34 ss = new Solution34();

        int n = ss.solution(
                new int[]{-2, 3, 0, 2, -5}
        );

        assertEquals(n, 2);
    }
}
