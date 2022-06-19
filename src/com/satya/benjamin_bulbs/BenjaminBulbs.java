package com.satya.benjamin_bulbs;

import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] args) {

        System.out.println("Enter numbers");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i * i <= n; i++) {

            System.out.println(i * i);

        }
    }
}
