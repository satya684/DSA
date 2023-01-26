package com.satya.ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.print("Please enter numbers here");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

       /* for (int row = 0; row < arr.length; row++){
            for (int col = 0; col< arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }*/ //TODO for normal output

    }
}
