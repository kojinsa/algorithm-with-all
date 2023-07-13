package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution30Test {

    @Test
    public void test() {

        Solution30 s = new Solution30();

        int[] a = s.solution(3, 12);

        assertArrayEquals(a, new int[]{3, 12});
    }


    @Test
    public void test2() {

        Solution30 s = new Solution30();

        int[] a = s.solution(2, 5);

        assertArrayEquals(a, new int[]{1, 10});
    }
}
