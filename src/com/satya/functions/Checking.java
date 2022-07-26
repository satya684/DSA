package com.satya.functions;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int ans = anyBaseToAnyBAse(n, b1, b2);

        System.out.println(ans);

    }

    public static int anyBaseToAnyBAse(int n, int b1, int b2) {

        int bn = anyBaseToDecimmal(n, b1);

        int dm = decimalToANyBase(bn, b2);

        return dm;

    }

    public static int anyBaseToDecimmal(int n, int b) {

        int p = 1;

        int rv = 0;

        while (n > 0) {

            int dig = n % 10;

            n = n / 10;

            rv += dig * p;

            p = p * b;

        }

        return rv;

    }

    public static int decimalToANyBase(int n, int b) {
        int p = 1;
        int rv = 0;

        while (n > 0) {


            int dig = n % b;

            n = n / b;

            rv += dig * p;

            p = p * 10;

        }
        return rv;
    }


}
