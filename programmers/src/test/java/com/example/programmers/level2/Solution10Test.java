package com.example.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution10Test {

    @Test
    public void test1() {

        Solution10 s = new Solution10();

        int[] arr = s.solution(3, new String[]{
                "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
        });

        assertArrayEquals(arr, new int[]{3, 3});
    }

    @Test
    public void test2() {

        Solution10 s = new Solution10();

        int[] arr = s.solution(5, new String[]{
                "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});

        assertArrayEquals(arr, new int[]{0, 0});
    }


    @Test
    public void test3() {

        Solution10 s = new Solution10();

        int[] arr = s.solution(2, new String[]{
                "hello", "one", "even", "never", "now", "world", "draw"
        });

        assertArrayEquals(arr, new int[]{1, 3});
    }

}
