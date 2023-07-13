package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution19Test {

    @Test
    public void test1() {
        Solution19 s = new Solution19();

        int n = s.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});

        assertEquals(n, 9);
    }

    @Test
    public void test2() {
        Solution19 s = new Solution19();

        int n = s.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});

        assertEquals(n, 0);
    }
}
