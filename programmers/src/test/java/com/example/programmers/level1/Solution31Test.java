package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution31Test {

    @Test
    public void test1() {

        Solution31 s = new Solution31();

        int[] a = s.solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        assertArrayEquals(
                a,
                new int[]{1, 3, 0, 1}
        );
    }

    @Test
    public void test2() {

        Solution31 s = new Solution31();

        int[] a = s.solution(new int[]{4, 4, 4, 3, 3});

        assertArrayEquals(
                a,
                new int[]{4, 3}
        );
    }
}
