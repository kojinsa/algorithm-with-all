package com.example.programmers.level1;

public class Solution3 {

    public int solution(int n) {

        int answer = 0;

        String nStr = String.valueOf(n);

        int size = nStr.length();

        for (int i = 0; i < size; i++) {

            String s = nStr.substring(i, i + 1);

            answer += Integer.valueOf(s);

        }

        return answer;
    }

    public static void main(String[] args) {

        Solution3 s = new Solution3();

        int n = s.solution(123);

        if (n == 6) System.out.printf("success");
        else System.out.printf("fail");
    }
}
