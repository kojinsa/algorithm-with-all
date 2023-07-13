package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution18Test {

    @Test
    public void test1() {

        Solution18 s = new Solution18();

        int[] array = s.solution(new int[]{4, 3, 2, 1});

        assertArrayEquals(array, new int[]{4, 3, 2});
    }

}
