package com.satya;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Digit");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
