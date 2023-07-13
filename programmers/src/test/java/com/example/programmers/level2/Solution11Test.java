package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution11Test {

    @Test
    public void test1() {

        Solution11 s = new Solution11();

        int n = s.solution(new int[]{70, 50, 80, 50}, 100);

        assertEquals(n, 3);
    }

    @Test
    public void test2() {

        Solution11 s = new Solution11();

        int n = s.solution(new int[]{70, 80, 50}, 100);

        assertEquals(n, 3);
    }

    @Test
    public void test3() {

        Solution11 s = new Solution11();

        int n = s.solution(new int[]{40, 40, 40}, 120);

        assertEquals(n, 2);
    }
}
