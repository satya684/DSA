package com.satya.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the number");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println("you entered " + n);

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {

            System.out.println(a);

            int c = a + b;

            a = b;

            b = c;

        }

    }
}
