package com.example.programmers.level1;

public class Solution31 {

    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length];

        int last = arr[0];

        answer[0] = last;

        int cnt = 1;

        for (int i = 1; i < arr.length; i++) {
            if (last != arr[i]) {
                last = arr[i];
                answer[cnt++] = last;
            }
        }

        int[] r = new int[cnt];

        System.arraycopy(answer, 0, r, 0, r.length);

        return r;
    }
}
