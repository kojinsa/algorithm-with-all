package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution14Test {

    @Test
    public void test1() {

        Solution14 s = new Solution14();

        int n = s.solution(6);

        assertEquals(n, 8);
    }

    @Test
    public void test2() {

        Solution14 s = new Solution14();

        int n = s.solution(16);

        assertEquals(n, 4);
    }

    @Test
    public void test3() {

        Solution14 s = new Solution14();

        int n = s.solution(626331);

        assertEquals(n, -1);
    }

}
