package com.satya;

import java.util.Scanner;

public class PracticeOne {

    public static void main(String[] args) {
        System.out.println("Please enter the digits here !!!!!");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numberOfDigits = 0;

        while (n != 0) {
            n = n / 10;

            numberOfDigits++;
        }
        System.out.println(numberOfDigits);

    }
}
