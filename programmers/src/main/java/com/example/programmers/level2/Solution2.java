package com.example.programmers.level2;

public class Solution2 {

    public String solution(String s) {
        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {

                    String temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;

                }

            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        sb.append(" ");
        sb.append(array[array.length - 1]);
        return sb.toString();
    }
}
