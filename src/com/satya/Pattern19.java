package com.satya;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int m = scn.nextInt();

        int sp = m / 2;
        int st = 1;
        int value = 1;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= sp; j++) {

                System.out.print("\t");

            }

            int cValue = value;

            for (int j = 1; j <= st; j++) {
                System.out.print(cValue+"\t");
                if (j <= st / 2) {
                    cValue++;
                }else {
                    cValue--;
                }
            }

            if (i <= m / 2) {
                sp--;
                st += 2;
                value++;
            } else {
                sp++;
                st -= 2;
                value--;
            }

            System.out.println();
        }
    }
}
