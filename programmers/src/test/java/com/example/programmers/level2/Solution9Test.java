package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution9Test {


    @Test
    public void test1() {

        Solution9 s = new Solution9();

        int n = s.solution("baabaa");

        assertEquals(n, 1);
    }

    @Test
    public void test2() {

        Solution9 s = new Solution9();

        int n = s.solution("cdcd");

        assertEquals(n, 0);
    }
}
