package com.satya.functions;

import java.util.Scanner;

public class AnyBAseToANyBAse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int b1 = scn.nextInt();

        int b2 = scn.nextInt();

        int base = anyBase(n, b1, b2);

        System.out.println(base);

    }

    public static int anyBase(int n, int b1, int b2) {

        int dec = anyBaseToDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);

        return dn;
    }

    public static int decimalToAnyBase(int n, int b) {

        int rv = 0;

        int p = 1;

        while (n > 0) {

            int dig = n % b;

            n = n / b;

            rv += dig * p;

            p = p * 10;
        }

        return rv;
    }

    public static int anyBaseToDecimal(int n, int b) {

        int rv = 0;

        int p = 1;

        while (n > 0) {
            int dig = n % 10;

            n = n / 10;

            rv += dig * p;

            p = p * b;
        }

        return rv;

    }
}
