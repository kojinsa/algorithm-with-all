package com.example.programmers.level1;

public class Solution27 {

    /**
     * @param price 초기 가격
     * @param money 현재 나의 가격
     * @param count 내가 타고 싶은 숫자
     * @return
     */
    public long solution(int price, int money, int count) {

        long answer = 0;

        int i = 1;

        while (i < count + 1) {
            answer += (long) price * i;
            i++;
        }

        if (answer <= money){
            return 0;
        }

        return answer - money;
    }
}
