package com.satya.functions;

import java.util.Scanner;

public class CheckDIG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = cheking(n, d);
        System.out.println(ans);

    }

    private static int cheking(int n, int d) {

        int rv = 0;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            if (dig == d) {
                rv++;
            }

        }

        return rv;

    }
}
