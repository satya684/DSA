package com.satya.functions;

import java.util.Scanner;

public class CheckDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = digits(n, d);
        System.out.println(ans);
    }

    public static int digits(int n, int d) {
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
