package com.example.programmers.level1;

public class Solution4 {

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution4 s = new Solution4();

        int n = s.solution(12);

        if (n == 28) System.out.println("success");
        else System.out.println("fail");
    }
}
