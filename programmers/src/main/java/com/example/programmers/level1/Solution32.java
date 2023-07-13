package com.example.programmers.level1;

import java.util.Arrays;

public class Solution32 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int cnt = 0;
        for (int v : d) {
            answer += v;
            if (answer >= budget) {
                break;
            }
            cnt++;
        }
        return cnt;
    }
}
