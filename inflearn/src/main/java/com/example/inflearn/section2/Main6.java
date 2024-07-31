package com.example.inflearn.section2;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String num = in.nextLine();
        String string = in.nextLine();
        in.close();

        StringBuilder sb = new StringBuilder();
        for (String s : string.split(" ")) {
            sb.delete(0, sb.length());
            for (int z = s.length() - 1; z >= 0; z--) {
                sb.append(s.charAt(z));
            }

            int n = Integer.parseInt(sb.toString());

            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
