package com.satya;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = 0;
        int star = n;

        for (int i = n; i >= 1; i-- ){

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            space++;
            star--;

            System.out.println(" ");
        }

    }
}