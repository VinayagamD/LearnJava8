package com.vinaylearn.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxing {

    public static List<Integer> boxing(){
       return IntStream.rangeClosed(1,10) // intstream of 10 elements
//                int
                .boxed()
//                Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
//        wrapper to primitive type
        return integerList.stream()
//                Wrapper Integer values
                .mapToInt(Integer::intValue) // intstream(intvalue of the wrapper class)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : " + boxing());
        System.out.println("Unboxing : " + unBoxing(boxing()));
    }
}
