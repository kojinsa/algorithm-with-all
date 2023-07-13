package com.example.programmers.level1;

public class Solution11 {

    public long solution(long n) {

        String[] array = String.valueOf(n).split("");

        int size = array.length;

        sort(array, size);

        StringBuilder sb = new StringBuilder();

        for (String c : array){
            sb.append(c);
        }

        return Long.parseLong(sb.toString());
    }

    private void sort(String[] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                String r = array[j];
                String l = array[i];
                if (r.compareTo(l) > 0) {
                    String temp = l;
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
