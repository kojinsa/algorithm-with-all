package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    @Test
    public void test() {

        Solution4 s = new Solution4();

        boolean t = s.solution("()()");

        assertEquals(t, true);
    }

    @Test
    public void test2() {

        Solution4 s = new Solution4();

        boolean t = s.solution("(())()");

        assertEquals(t, true);
    }

    @Test
    public void test3() {

        Solution4 s = new Solution4();

        boolean t = s.solution(")()(");

        assertEquals(t, false);
    }

    @Test
    public void test4() {

        Solution4 s = new Solution4();

        boolean t = s.solution("(()(");

        assertEquals(t, false);
    }

    @Test
    public void test5() {

        Solution4 s = new Solution4();

        boolean t = s.solution("()())");

        assertEquals(t, false);
    }
}
