package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void test1() {

        Solution solution = new Solution();

        int n = solution.solution(new int[]{1, 2, 3, 4});

        assertEquals(n, 5);
    }

    @Test
    public void test2() {

        Solution solution = new Solution();

        int n = solution.solution(new int[]{2, 4, 8});

        assertEquals(n, 16);
    }

}
