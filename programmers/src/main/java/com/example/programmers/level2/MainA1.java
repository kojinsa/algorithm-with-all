package com.example.programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class MainA1 {

    public int solution(int[] A, int[] B) {

        int answer = 0;

        int aSize = A.length;

        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());


        for (int i = 0; i < aSize; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }

        while (!a.isEmpty()) {
            answer = answer + (a.poll() * b.poll());
        }

        return answer;
    }

}
