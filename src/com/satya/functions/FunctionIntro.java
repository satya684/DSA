package com.satya.functions;

import java.util.Scanner;

public class FunctionIntro {

    public static int fact(int x) {
        int rv = 1;

        for (int i = 1; i <= x; i++) {

            rv = rv * i;

        }

        return rv;
    }

    public static void print(int x, int y, int npr) {
        System.out.println(x + "P" + y + "=" + npr);
    }

    public static void main(String[] args) {
        // TODO :-  nPr = n! / (n - r)!

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nFact = fact(n);
        int nrFact = fact(n - r);


        int nPr = nFact / nrFact;
        print(n, r, nPr);

    }

}
