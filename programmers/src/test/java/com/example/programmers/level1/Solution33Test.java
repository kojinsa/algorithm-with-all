package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution33Test {


    @Test
    public void test1() {

        Solution33 s = new Solution33();

        String s1 = s.solution("AB", 1);

        assertEquals(s1, "BC");
    }

    @Test
    public void test2() {

        Solution33 s = new Solution33();

        String s1 = s.solution("z", 1);

        assertEquals(s1, "a");
    }
}
