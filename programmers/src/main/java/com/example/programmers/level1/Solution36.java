package com.example.programmers.level1;

public class Solution36 {

    /*
    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     */

    final int[] a1 = new int[]{
            1, 2, 3, 4, 5
    };

    final int[] a2 = new int[]{
            2, 1, 2, 3, 2, 4, 2, 5
    };

    final int[] a3 = new int[]{
            3, 3, 1, 1, 2, 2, 4, 4, 5, 5
    };

    public int[] solution(int[] answers) {

        int[] a = new int[3];

        int max = 0;

        for (int i = 0; i < answers.length; i++) {

            int n = answers[i];

            int nA = a1[i - (a1.length * (i / a1.length))];
            int nB = a2[i - (a2.length * (i / a2.length))];
            int nC = a3[i - (a3.length * (i / a3.length))];

            if (n == nA) a[0] += 1;
            if (n == nB) a[1] += 1;
            if (n == nC) a[2] += 1;

            max = Math.max(a[0], Math.max(a[1], a[2]));
        }

        return new int[]{0};
    }
}
