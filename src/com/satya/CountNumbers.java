package com.satya;

import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int dig = 0;

        while (n != 0) {

            n = n / 10;

            dig = dig + 1;

        }

        System.out.println(dig);

    }

}