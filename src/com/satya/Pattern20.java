package com.satya;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sp = 2 * n - 3;
        int st = 1;

        for (int i = 1; i <= n; i++) {

            int value = 1;

            for (int j = 1; j <= st; j++) {

                System.out.print(value + "\t");
                value++;
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            if (i == n) {
                st--;
                value--;
            }
            for (int j = 1; j <= st; j++) {
                value--;
                System.out.print(value + "\t");
            }

            st++;
            sp -= 2;

            System.out.println();
        }
    }
}
