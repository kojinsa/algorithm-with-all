package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution13Test {

    @Test
    public void test1() {

        Solution13 solution13 = new Solution13();

        int n = solution13.solution(new int[]{
                70, 50, 80, 50
        }, 100);

        assertEquals(n, 3);
    }

    @Test
    public void test2() {

        Solution13 solution13 = new Solution13();

        int n = solution13.solution(new int[]{
                70, 80, 50
        }, 100);

        assertEquals(n, 3);
    }
}
