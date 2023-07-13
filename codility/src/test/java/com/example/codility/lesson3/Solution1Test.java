package com.example.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @Test
    public void test() {

        Solution1 s = new Solution1();

        int n = s.solution(10, 85, 30);

        assertEquals(3, n);
    }
}
