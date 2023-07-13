package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution13Test {


    @Test
    public void test() {

        Solution13 s = new Solution13();

        long l = s.solution(3, 5);

        assertEquals(l, 12L);
    }
}
