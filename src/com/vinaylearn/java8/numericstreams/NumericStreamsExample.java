package com.vinaylearn.java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> integerList){
       return integerList.stream()
                .reduce(0, (x,y) -> x+y);
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,6) // 1,2,3,4,5,6
        .sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of N Numbers : "+ sumOfNumbers(integers));
        System.out.println("Sum of N Number using IntStream: "+sumOfNumbersIntStream());


    }
}
