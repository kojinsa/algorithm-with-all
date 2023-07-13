package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution20Test {


    @Test
    public void test1() {

        Solution20 s = new Solution20();

        int n = s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});

        assertEquals(n, 14);
    }

    @Test
    public void test2() {

        Solution20 s = new Solution20();

        int n = s.solution(new int[]{5, 8, 4, 0, 6, 7, 9});

        assertEquals(n, 6);
    }
}
