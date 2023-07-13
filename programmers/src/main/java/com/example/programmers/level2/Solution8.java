package com.example.programmers.level2;

public class Solution8 {

    //조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
    //조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
    //조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toBinaryString(n);

        int cnt = getOneCount(s);

        int startNum = n;

        while (true) {

            startNum += 1;

            int num = getOneCount(Integer.toBinaryString(startNum));

            if (cnt == num) {
                break;
            }
        }

        return startNum;
    }

    private int getOneCount(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if ('1' == c) {
                cnt++;
            }
        }
        return cnt;
    }
}
