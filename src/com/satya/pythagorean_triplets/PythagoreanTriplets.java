package com.satya.pythagorean_triplets;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {

        System.out.println("Enter digits here !!!!");

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter digits for value a !!!!");

        int a = scn.nextInt();

        System.out.println("Enter digits for value b !!!!");

        int b = scn.nextInt();

        System.out.println("Enter digits for value c !!!!");

        int c = scn.nextInt();

        int max = a;

        if (max <= b) {

            max = b;

        }

        if (max <= c) {

            max = c;

        }

        if (max == a) {

            boolean flag = (((b * b) + (c * c)) == (a * a));

            System.out.println(flag);

        } else if (max == b) {

            boolean flag = ((a * a) + (c * c) == (b * b));

            System.out.println(flag);

        } else {

            boolean flag = ((a * a) + (b * b) == (c * c));

            System.out.println(flag);

        }

    }
}
