package com.satya;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();

        int sp = 0;
        int st = m;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println(" ");
        }

    }
}
