package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution17Test {

    @Test
    public void test1() {

        Solution17 s = new Solution17();

        int[] arr = s.solution(new int[]{9, 7, 5, 10}, 5);

        assertArrayEquals(arr, new int[]{5, 10});
    }

    @Test
    public void test2() {

        Solution17 s = new Solution17();

        int[] arr = s.solution(new int[]{2, 36, 1, 3}, 1);

        assertArrayEquals(arr, new int[]{1, 2, 3, 36});
    }

    @Test
    public void test3() {

        Solution17 s = new Solution17();

        int[] arr = s.solution(new int[]{3, 2, 6}, 10);

        assertArrayEquals(arr, new int[]{-1});
    }

}
