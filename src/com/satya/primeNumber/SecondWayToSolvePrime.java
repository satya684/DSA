package com.satya.primeNumber;

import java.util.Scanner;

public class SecondWayToSolvePrime {

    public static void main(String[] args) {
        System.out.println("please enter number here ");
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        System.out.println("please enter " + t + " number here ");
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int counter = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    counter = counter + 1;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");

            }
        }
    }

}
