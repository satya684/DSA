package com.satya.summary;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.println("enter numbers");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();


        while (n != 0) {

           int q = n % 10;

            n  = n / 10;

            System.out.println(q);
        }
    }
}
