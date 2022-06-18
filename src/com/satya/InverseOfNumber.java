package com.satya;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;
        int temp = n;
        while (temp != 0) {

            temp = temp / 10;
            nod++;

        }
        int position = 0;
        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = n / div;
            position++;
//            System.out.println("position " +  position);
//            System.out.println(q);
            n = n % div;
            div = div / 10;

            q = q * (int) Math.pow(10, position - 1);
            System.out.print(q);
        }

    }
}
