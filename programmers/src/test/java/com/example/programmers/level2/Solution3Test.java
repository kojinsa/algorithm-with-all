package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    @Test
    public void test() {

        Solution3 s = new Solution3();

        String str = s.solution("3people unFollowed me");

        assertEquals(str, "3people Unfollowed Me");
    }

    @Test
    public void test2() {

        Solution3 s = new Solution3();

        String str = s.solution("for the last week");

        assertEquals(str, "For The Last Week");
    }

    @Test
    public void test3() {

        Solution3 s = new Solution3();

        String str = s.solution(" A  Sdf Fft ");

        assertEquals(str, " A  Sdf Fft ");
    }
}
