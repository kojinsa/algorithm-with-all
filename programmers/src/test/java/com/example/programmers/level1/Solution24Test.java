package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution24Test {

    @Test
    public void test1() {

        Solution24 s = new Solution24();

        String v = s.solution("Zbcdefg");

        assertEquals(v, "gfedcbZ");
    }
}
