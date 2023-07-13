package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution6Test {

    @Test
    public void test1() {

        Solution6 s = new Solution6();

        int n = s.solution(15);

        assertEquals(n, 4);
    }

}
