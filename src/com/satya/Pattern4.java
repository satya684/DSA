package com.satya;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        /*
        logic

         System.out.println(space+" "+star);
                space--;
                star++;

        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {

//                System.out.println(space+" "+star);
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println(" ");
        }
    }
}
