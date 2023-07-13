package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution22Test {

    @Test
    public void test() {
        Solution22 s = new Solution22();
        String v = s.solution(3);

        assertEquals("수박수", v);
    }

    @Test
    public void test2() {

        Solution22 s = new Solution22();
        String v = s.solution(4);

        assertEquals("수박수박", v);
    }

}
