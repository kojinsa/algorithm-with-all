package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution16Test {

    @Test
    public void test() {

        Solution16 s = new Solution16();

        String n = s.solution("01033334444");

        assertEquals(n, "*******4444");
    }

    @Test
    public void test2() {

        Solution16 s = new Solution16();

        String n = s.solution("027778888");

        assertEquals(n, "*****8888");
    }

}
