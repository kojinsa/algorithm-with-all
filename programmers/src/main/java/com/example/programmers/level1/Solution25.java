package com.example.programmers.level1;

public class Solution25 {

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            Item item = getItem(i);
            if (item.isAble) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    private Item getItem(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(",");
            }
        }
        return new Item(sb.toString().split(","));
    }

    public static class Item {

        // 약수
        String[] array;

        // 약수의 갯수
        int count;

        // 짝수여부
        boolean isAble;

        public Item(String[] array) {
            this.array = array;
            this.count = array.length;
            this.isAble = count % 2 == 0;
        }
    }
}
