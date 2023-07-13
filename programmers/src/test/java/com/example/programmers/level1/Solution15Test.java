package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution15Test {

    @Test
    public void test1() {

        Solution15 s = new Solution15();

        String v = s.solution(new String[]{"Jane", "Kim"});

        assertEquals(v, "김서방은 1에 있다");
    }

}
