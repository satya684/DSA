package com.satya;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int jk = 1;
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(jk+" ");
                jk++;
            }

            System.out.println(" ");
        }

    }
}
