package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution5Test {

    @Test
    public void test1() {

        Solution5 s = new Solution5();

        int[] arr = s.solution("110010101001");

        assertArrayEquals(arr, new int[]{3, 8});
    }

    @Test
    public void test2() {

        Solution5 s = new Solution5();

        int[] arr = s.solution("01110");

        assertArrayEquals(arr, new int[]{3, 3});
    }

    @Test
    public void test3() {

        Solution5 s = new Solution5();

        int[] arr = s.solution("1111111");

        assertArrayEquals(arr, new int[]{4, 1});
    }

}
