package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution12Test {

    @Test
    public void test1() {

        Solution12 s = new Solution12();

        int x = s.solution(10);

        assertEquals(x, 3);
    }

}
