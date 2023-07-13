package com.example.programmers.level1;

public class Solution14 {

    public int solution(int num) {

        if (num == 1) return 0;

        long answer = num;

        int count = 0;

        while (answer != 1) {

            boolean isAble = answer % 2 == 0;

            if (isAble) {
                answer = answer / 2;
            } else {
                answer = answer * 3 + 1;
            }

            count++;

            if (count == 500) {
                count = -1;
                break;
            }
        }

        return count;
    }
}
