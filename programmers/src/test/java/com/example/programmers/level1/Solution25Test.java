package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution25Test {

    @Test
    public void test1() {

        Solution25 s = new Solution25();

        int v = s.solution(13, 17);

        assertEquals(v, 43);
    }

    @Test
    public void test2() {

        Solution25 s = new Solution25();

        int v = s.solution(24, 27);

        assertEquals(v, 52);
    }
}
