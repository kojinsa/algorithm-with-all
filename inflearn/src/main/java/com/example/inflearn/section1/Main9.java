package com.example.inflearn.section1;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String result = str.replaceAll("[^0-9]", "");
        System.out.println(Integer.valueOf(result));
    }
}
