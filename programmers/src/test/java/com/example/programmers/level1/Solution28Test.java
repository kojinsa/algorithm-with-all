package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution28Test {

    @Test
    public void test1() {

        Solution28 s = new Solution28();

        int[][] a = s.solution(
                new int[][]{
                        new int[]{1, 2},
                        new int[]{2, 3},
                },
                new int[][]{
                        new int[]{3, 4},
                        new int[]{5, 6},
                }
        );

        assertArrayEquals(
                a,
                new int[][]{
                        new int[]{
                                4, 6
                        },
                        new int[]{
                                7, 9
                        }
                }
        );
    }

    @Test
    public void test2() {

        Solution28 s = new Solution28();

        int[][] a = s.solution(
                new int[][]{
                        new int[]{1},
                        new int[]{2},
                },
                new int[][]{
                        new int[]{3},
                        new int[]{4},
                }
        );

        assertArrayEquals(
                a,
                new int[][]{
                        new int[]{
                                4
                        },
                        new int[]{
                                6
                        }
                }
        );
    }
}
