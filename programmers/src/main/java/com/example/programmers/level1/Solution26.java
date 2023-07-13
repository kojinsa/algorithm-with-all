package com.example.programmers.level1;

public class Solution26 {

    public boolean solution(String s) {

        boolean answer = true;

        if (s.length() == 0 || s.length() > 8) {
            return false;
        }

        if (!(s.length() == 4 || s.length() == 6)){
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!(c >= 48 && c <= 57)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
