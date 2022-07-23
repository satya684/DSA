package com.satya.functions;

import java.util.Scanner;

public class DecimalToAnyBase1 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int b = scn.nextInt();

        int ans = fun(n, b);

        System.out.println(ans);
    }


    private static int fun(int n, int b) {

        int p = 1;

        int rv = 0;

        while (n > 0){

            int dig = n % b;

            n = n / b;

            rv += dig * p;

            p = p * 10;

        }

        return  rv;

    }

}
