package com.satya.primeNumber;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        /*
        TODO:- jo khud se aur 1 se divide hota hai use prime number bolte hai
         */

         /*
        TODO:- First algo to solve prime number
         */

        System.out.println("Please enter number here!");

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        int i;

        System.out.println("please enter " + t + " numbers");

        for (i = 0; i < t; i++) {

            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        }
        
    }

}
