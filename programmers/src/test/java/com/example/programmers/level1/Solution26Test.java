package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution26Test {

    @Test
    public void test1() {

        Solution26 s = new Solution26();

        boolean b = s.solution("a234");

        assertFalse(b);
    }

    @Test
    public void test2() {

        Solution26 s = new Solution26();

        boolean b = s.solution("1234");

        assertTrue(b);
    }
}
