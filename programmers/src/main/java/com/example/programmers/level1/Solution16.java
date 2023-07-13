package com.example.programmers.level1;

public class Solution16 {

    public String solution(String phone_number) {

        StringBuilder a = new StringBuilder();

        int phoneSize = phone_number.length();

        int startSize = phoneSize - 4;

        a.append("*".repeat(Math.max(0, startSize)));

        a.append(phone_number, startSize, phoneSize);

        return a.toString();
    }
}
