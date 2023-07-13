package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution27Test {


    @Test
    public void test1() {

        Solution27 s = new Solution27();

        long n = s.solution(3, 20, 4);

        assertEquals(n, 10);
    }

}
