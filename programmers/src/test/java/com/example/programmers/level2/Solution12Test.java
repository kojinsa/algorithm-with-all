package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution12Test {

    @Test
    public void test1() {

        Solution12 solution12 = new Solution12();

        int n = solution12.solution(8, 4, 7);

        assertEquals(n, 3);
    }
}
