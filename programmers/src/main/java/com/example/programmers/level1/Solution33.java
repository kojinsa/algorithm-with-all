package com.example.programmers.level1;

public class Solution33 {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch + n > 'z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + n > 'Z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            }
        }

        return answer.toString();
    }
}
