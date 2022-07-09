package com.satya;

import java.util.Scanner;

/*Formula


1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1


 * i c j + 1  = i c j * (i - j) / j + 1
 * */

public class Pattern16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {

            int ij = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(ij + "\t");

                int icjp1 = ij * (i - j) / (j + 1);
                ij = icjp1;

            }

            System.out.println();
        }
    }
}
