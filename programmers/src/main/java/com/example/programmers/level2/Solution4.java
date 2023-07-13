package com.example.programmers.level2;

public class Solution4 {

    public boolean solution(String s) {

        char[] arr = s.toCharArray();

        int size = arr.length;

        // 조건 방어로직
        // 문자열 s의 길이 : 100,000 이하의 자연수
        if (size > 100000) {
            throw new RuntimeException("문자열 s의 길이 : 100,000 이하의 자연수");
        }

        // 조건 1 짝수가 아니면 바로 실패 처리
        if (size % 2 != 0) {
            return false;
        }

        int cnt = 0;
        int num = 0;

        // O(N)
        while (size != cnt) {

            char val = arr[cnt];

            if ('(' == val){
                num++;
            } else if (')' == val){
                num--;
            }

            if(num < 0){
                break;
            }

            cnt++;
        }

        return num == 0;
    }

}
