package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution11Test {

    @Test
    public void test1() {

        Solution11 s = new Solution11();

        long x = s.solution(118372L);

        assertEquals(873211L, x);
    }

}
