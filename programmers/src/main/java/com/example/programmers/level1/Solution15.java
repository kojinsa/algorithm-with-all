package com.example.programmers.level1;

public class Solution15 {

    public String solution(String[] seoul) {

        int kimCnt = 0;

        for (String v : seoul) {
            if ("Kim".equals(v)) {
                break;
            }
            kimCnt++;
        }

        return String.format("김서방은 %d에 있다", kimCnt);
    }
}
