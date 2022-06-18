package com.satya;

import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {
        System.out.println("Please enter your number here!");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;
        while (n != 0) {

            n = n / 10;
            nod++;

            System.out.println(nod);
        }

    }
}
