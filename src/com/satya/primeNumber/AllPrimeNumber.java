package com.satya.primeNumber;

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {

        System.out.println("enter low and high value");

        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            System.out.println(i);
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");

            }
        }
    }
}
