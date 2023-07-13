package com.example.programmers.level2;

public class Solution12 {

    //첫 번째 라운드에서 4번 참가자는 3번 참가자와 붙게 되고,
    //7번 참가자는 8번 참가자와 붙게 됩니다.
    //항상 이긴다고 가정했으므로 4번 참가자는 다음 라운드에서 2번이 되고, 7번 참가자는 4번이 됩니다.
    //두 번째 라운드에서 2번은 1번과 붙게 되고, 4번은 3번과 붙게 됩니다.
    //항상 이긴다고 가정했으므로 2번은 다음 라운드에서 1번이 되고, 4번은 2번이 됩니다.
    //세 번째 라운드에서 1번과 2번으로 두 참가자가 붙게 되므로 3을 return 하면 됩니다.

    // 1   2 3
    // 1,2 1
    // 3,4 4 4
    // 5,6 6 7
    // 7,8 7

    public int solution(int n, int a, int b) {

        int answer = 1;

        while (true) {

            System.out.println("input a :" + a);
            System.out.println("input b :" + b);

            System.out.println("---------------- 1");

            a = (a + 1) / 2;
            b = (b + 1) / 2;

            System.out.println("input a :" + a);
            System.out.println("input b :" + b);

            System.out.println("---------------- 2");

            if (a == b)
                break;

            answer++;

        }

        return answer;
    }
}
