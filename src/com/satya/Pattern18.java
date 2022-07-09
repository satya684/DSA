package com.satya;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        for (int i = 1; i <= 10; i++) {

            int answer = x * i;

            System.out.println(x + " * " +  i  + " = " + answer);
        }


    }
}
