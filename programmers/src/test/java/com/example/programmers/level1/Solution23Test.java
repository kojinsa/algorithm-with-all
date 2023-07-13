package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution23Test {


    @Test
    public void test1() {
        Solution23 s = new Solution23();
        int n = s.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        assertEquals(n, 3);
    }

    @Test
    public void test2() {
        Solution23 s = new Solution23();
        int n = s.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1});
        assertEquals(n, -2);
    }

}
