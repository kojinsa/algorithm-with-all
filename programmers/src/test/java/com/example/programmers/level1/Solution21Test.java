package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution21Test {

    @Test
    public void test1() {

        Solution21 s = new Solution21();

        String v = s.solution("abcde");

        assertEquals("c", v);
    }


    @Test
    public void test2() {

        Solution21 s = new Solution21();

        String v = s.solution("qwer");

        assertEquals("we", v);
    }
}
