package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution8Test {

    @Test
    public void test1() {

        Solution8 s = new Solution8();

        int n = s.solution(78);

        assertEquals(n, 83);
    }

    @Test
    public void test2() {

        Solution8 s = new Solution8();

        int n = s.solution(15);

        assertEquals(n, 23);
    }

}
