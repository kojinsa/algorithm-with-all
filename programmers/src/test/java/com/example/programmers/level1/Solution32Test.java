package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution32Test {

    @Test
    public void test1() {
        Solution32 s = new Solution32();
        int n = s.solution(new int[]{1, 3, 2, 5, 4}, 9);
        assertEquals(n, 3);
    }

    @Test
    public void test2() {
        Solution32 s = new Solution32();
        int n = s.solution(new int[]{2, 2, 3, 3}, 10);
        assertEquals(n, 4);
    }

}
