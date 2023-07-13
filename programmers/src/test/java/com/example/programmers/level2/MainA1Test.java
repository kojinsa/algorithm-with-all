package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainA1Test {

    @Test
    public void case1() {
        MainA1 a = new MainA1();

        int n = a.solution(
                new int[]{1, 4, 2},
                new int[]{5, 4, 4}
        );

        assertEquals(n, 29);
    }

    @Test
    public void case2() {
        MainA1 a = new MainA1();

        int n = a.solution(
                new int[]{1, 2},
                new int[]{3, 4}
        );

        assertEquals(n, 10);
    }
}
