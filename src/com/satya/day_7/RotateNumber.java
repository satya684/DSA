package com.satya.day_7;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        System.out.println("digits");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("k");
        int k = scanner.nextInt();

        int temp = n;
        int nod = 0;
        while (temp != 0) {

            temp = temp / 10;
            nod++;
//            System.out.println(nod);
        }

        k = k % nod; // for maximum number

        if (k < 0) { // for -ve number
            k = k + nod;
        }

        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else multi = multi * 10;
        }
        int q = n / div;
        int r = n % div;

        int rot = r * multi + q;
        System.out.println(rot);

    }
}
