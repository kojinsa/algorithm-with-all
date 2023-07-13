package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution10Test {

    @Test
    public void test1() {

        Solution10 s = new Solution10();

        boolean b = s.solution(10);

        assertTrue(b);
    }

    @Test
    public void test2() {

        Solution10 s = new Solution10();

        boolean b = s.solution(12);

        assertTrue(b);
    }

    @Test
    public void test3() {

        Solution10 s = new Solution10();

        boolean b = s.solution(11);

        assertFalse(b);
    }

    @Test
    public void test4() {

        Solution10 s = new Solution10();

        boolean b = s.solution(13);

        assertFalse(b);
    }

}
