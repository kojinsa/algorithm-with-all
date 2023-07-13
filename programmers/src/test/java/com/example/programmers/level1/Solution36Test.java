package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution36Test {

    @Test
    public void test() {

        Solution36 s = new Solution36();

        int[] array = s.solution(
                new int[]
                        {
                                1, 2, 3, 4, 5
                        }
        );

        assertArrayEquals(
                array,
                new int[]{
                        1
                }
        );
    }


    @Test
    public void test2() {

        Solution36 s = new Solution36();

        int[] array = s.solution(
                new int[]
                        {
                                1, 3, 2, 4, 2
                        }
        );

        assertArrayEquals(
                array,
                new int[]{
                        1, 2, 3
                }
        );
    }
}
