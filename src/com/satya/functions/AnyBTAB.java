package com.satya.functions;

import java.util.Scanner;

public class AnyBTAB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int b1 = sc.nextInt();

        int b2 = sc.nextInt();

        int ans = chcekFun(n, b1, b2);

        System.out.println(ans);
    }

    public static int chcekFun(int n, int b1, int b2) {

        int dec = 0;

        int anyBaseToAnyBase = 0;

        return anyBaseToAnyBase;

    }

    public static int anyBaseToDecimal(int n, int b) {

        int rv = 0;

        int p = 1;

        while (n > 0){

            int dig = n % b;

            n = n / b;

            rv += dig * p;

            p = p * 10;

        }

        return rv;
    }
}
