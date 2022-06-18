package com.satya;

import java.util.Scanner;

public class SecondQa {
    public static void main(String[] args) {
        System.out.println("please enter some digits here!!");

        Scanner scn = new Scanner(System.in);
        int userDigit = scn.nextInt();
        System.out.println("Your entered digits is" + userDigit);

        int nod = 0;
        int temp = userDigit;
        while (temp != 0) {

            temp = temp / 10;

            nod++;

        }
        System.out.println("number of digits are" + nod);

        int div = (int) Math.pow(10, nod - 1);

        while (div != 0) {
            int qo = userDigit / div;

            System.out.println(qo);

            userDigit = userDigit % div;

            div = div / 10;


        }


    }
}
