package com.satya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Day 6

        //Q. print number revers

        System.out.println("Please enter some number here!!!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {

            int dig = n % 10; // mod for remainder

            n = n / 10; // user ke diye gye number ko chhota krne ke liye

            System.out.println(dig);
        }

    }
}
