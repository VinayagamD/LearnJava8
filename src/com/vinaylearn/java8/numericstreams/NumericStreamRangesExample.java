package com.vinaylearn.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50); // It will return till 49
        System.out.println(" Range Count ==========> "+intStream.count());
        IntStream.range(1,50).forEach((value -> System.out.print(value+",")));
        System.out.println();
        System.out.println("Range Count Closed =======> "+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach((value -> System.out.print(value+",")));
        System.out.println();
        System.out.println("Long Stream Range Closed count "+ LongStream.rangeClosed(1,50).count());
        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.print(value+",")));
        System.out.println();
    }
}
