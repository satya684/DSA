package com.satya;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++){


            for (int t = 1; t <= i; t++){

                System.out.print(a+"\t");

                int c = a + b;
                a = b;
                b = c;

            }

            System.out.println();
        }

    }
}
