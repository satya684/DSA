package com.satya.basics;

public class VariablesInJava {
    /*

     *  TODO: Hm apna data program me kaise store kr skte but
          kisi bhi variable ko define krne se pahle uska dataType declare  kiya jata hai


     *     TODO:- DATATYPE:- String,  Int, Float, Char, Double, Long, Boolean

     *    TODO:- Definition :- variables are works as a container which holds the value with their respective DataType during the
                               execution of program.


     * TODO:- Example Below

     */

    public static void main(String[] args) {

        /*
         * TODO : Example of Int
         */

        int firstValue = 10;
        int secondValue = 10;
        int sumOfBothValues = firstValue + secondValue;
        System.out.println(sumOfBothValues);

        /*
         * TODO : Example of String
         */

        String firstName = "Satya";
        System.out.println(firstName);

        /*
         * TODO : Example of Boolean
         */

        boolean test = true;
        boolean testAgain = false;

        System.out.println(test);
        System.out.println(testAgain);

        /*
         * TODO : Another Example to understand the concept of math in java  :-   xy/x + y
         */

        int x = 10;
        int y = 10;
        int ans = (x * y) / (x + y);
        System.out.println("answer ll be :-" + ans);
    }
}
