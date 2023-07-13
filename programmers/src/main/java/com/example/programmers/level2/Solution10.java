package com.example.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {

    public int[] solution(int n, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int round = 0;
        int breakPos = 0;
        char prevKey = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            Integer value = map.getOrDefault(key, 0);
            char firstChar = key.charAt(0);
            if (value > 0 || firstChar != prevKey) {
                breakPos = i;
                round = i / n;
                break;
            }
            map.put(key, value + 1);
            prevKey = key.charAt(key.length() - 1);
        }

        if (round == 0 && breakPos == 0) return new int[]{0, 0};

        int s = (breakPos - (round * n) + 1);
        round += 1;
        return new int[]{s, round};
    }
}
