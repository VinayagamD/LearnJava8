package com.vinaylearn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMutliplication(List<Integer> integerList){

        return integerList.stream()
                //1
                //3
                //5
                //7
                //a = 1, b=1 (from stream) => result 1 is returned
                //a = 1, b=3 (from stream) => result 3 is returned
                //a = 3, b=5 (from stream) => result 15 is returned
                //a = 15 , b=7 (from stream) => result 105 is returned
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMutliplicationWithoutIdentity(List<Integer> integerList){

        return integerList.stream()
                //1
                //3
                //5
                //7
                //a = 1, b=1 (from stream) => result 1 is returned
                //a = 1, b=3 (from stream) => result 3 is returned
                //a = 3, b=5 (from stream) => result 15 is returned
                //a = 15 , b=7 (from stream) => result 105 is returned
                .reduce((a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5, 7 );
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(performMutliplication(integers));
        Optional<Integer> result = performMutliplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        Optional<Integer> result1 = performMutliplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());
        if (result1.isPresent())
        System.out.println(result1.get());
    }
}
