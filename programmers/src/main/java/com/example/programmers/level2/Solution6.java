package com.example.programmers.level2;

public class Solution6 {

    // todo : false
    // https://school.programmers.co.kr/learn/courses/30/lessons/12924
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int inum = i;
            int add = 0;
            while (true) {
                add += inum;

                if (add == n) {
                    answer++;
                    break;
                } else if (add > n) {
                    break;
                }
                inum++;
            }
        }
        return answer;
    }
}
