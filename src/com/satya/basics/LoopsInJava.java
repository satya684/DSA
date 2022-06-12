package com.satya.basics;

public class LoopsInJava {
    public static void main(String[] args) {
        /*
        TODO := kisi kam ko bar bar krne ke liye loops ka use krte hai
                   =#  while , doWhile, for
         */
        int value = 1;

        while (value <= 9) {

            System.out.println(value);

            value = value + 1;

        }
        System.out.println("Done while loop");

        /*
        TODO := for loop Example
         */

        for (value = 1; value <= 9; value++){

            System.out.println(value);

        }

        System.out.println("Done for loop");
    }
}
