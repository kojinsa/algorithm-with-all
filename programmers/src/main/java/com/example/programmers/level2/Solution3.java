package com.example.programmers.level2;

public class Solution3 {

    public String solution(String s) {

        int size = s.length();

        if (size < 1 || size > 200) {
            throw new RuntimeException("s는 길이 1 이상 200 이하인 문자열입니다.");
        }

        StringBuilder answer = new StringBuilder();

        String[] array = s.split(" ");

        int arraySize = array.length;

        // O(M*N*V)
        for (int i = 0; i < arraySize; i++) {

            String strings = array[i];

            // 방어로직 추가
            if (" ".equals(strings)) continue;

            char[] charts = strings.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < charts.length; j++) {
                char c = charts[j];
                String a = String.valueOf(c);
                a = j == 0 ? a.toUpperCase() : a.toLowerCase();
                sb.append(a);
            }

            answer.append(sb.toString());

            if (i != arraySize - 1) {
                answer.append(" ");
            } else if (i == arraySize - 1 && answer.length() != size) {

                int num = size - answer.length();

                for (int v = 0; v < num; v++) {
                    answer.append(" ");
                }

            }
        }

        return answer.toString();
    }
}
