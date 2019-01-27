package com.vinaylearn.java8.imperativevsdecalrative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /*
        *
        * Imperative - how Style of programming
        * */
        int sum =0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Sum using Imperative Approach: "+sum);
        /*
        *
        * Declarative Style of programming - What Style of Programming
        * */
        int sum1 = IntStream.rangeClosed(0,100) // it splits the values
                .parallel()
                .sum();
        System.out.println("Declarative Style of programming"+sum1);
    }
}
