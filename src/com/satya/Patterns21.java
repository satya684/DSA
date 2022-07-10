package com.satya;

import java.util.Scanner;

public class Patterns21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sp = n / 2;

        int st = 1;

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= sp; i++) {
                if (j == n / 2 + 1){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }

            for (int i = 1; i <= st; i++) {
                System.out.print("*\t");
            }

            if (j <= n / 2){
                st++;
            }else st--;

            System.out.println();
        }

    }
}
