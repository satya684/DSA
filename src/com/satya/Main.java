package com.satya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO:-  Practice Day

        //Q. Java program to Count the number of digits in a given integer

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;

        while (n != 0) {

            n = n / 10;

            nod++;

        }
        System.out.println(nod);

    }
}
