package com.satya.day_8;

import java.util.Scanner;

public class GCDnLCD {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter you num1 here");

        int num1 = scn.nextInt();

        int oNum1 = num1;

        System.out.println("enter you num2 here");

        int num2 = scn.nextInt();

        int oNum2 = num2;

        if (num1 % num2 != 0) {

            int rem = num1 % num2;

            num1 = num2;

            num2 = rem;

        }

        int gcd = num2;

        int lcd = (oNum1 * oNum2) / gcd;

        System.out.println("gcd is " + gcd);

        System.out.println("lcd is " + lcd);

    }
}
