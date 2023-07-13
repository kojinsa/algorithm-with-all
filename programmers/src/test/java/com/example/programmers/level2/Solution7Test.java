package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution7Test {

    @Test
    public void test() {

        Solution7 s = new Solution7();

        int n = s.solution(3);

        assertEquals(n, 2);
    }

    @Test
    public void test2() {

        Solution7 s = new Solution7();

        int n = s.solution(5);

        assertEquals(n, 5);
    }

}
