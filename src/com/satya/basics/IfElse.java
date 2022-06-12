package com.satya.basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        /*

        TODO:- IF ELSE QUEStIOn

     *   TODO:-  > greater than
     *   TODO:-  < less than

        */

        System.out.println("Please enter your marks here:- ");

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90) {

            System.out.println("excellent");

        } else if (marks > 80 && marks <= 90) {

            System.out.println("good");

        } else if (marks > 70 && marks <= 80) {

            System.out.println("fair");

        } else if (marks > 60 && marks <= 70) {

            System.out.println("meets expectations");

        } else if (marks <= 60) {

            System.out.println("below par");
        }

    }
}
