package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    @Test
    public void test() {

        Solution2 s = new Solution2();

        String str = s.solution("1 2 3 4");

        assertEquals(str, "1 4");
    }
    @Test
    public void test2() {

        Solution2 s = new Solution2();

        String str = s.solution("-1 -2 -3 -4");

        assertEquals(str, "-4 -1");
    }

    @Test
    public void test3() {

        Solution2 s = new Solution2();

        String str = s.solution("-1 -1");

        assertEquals(str, "-1 -1");
    }
}
