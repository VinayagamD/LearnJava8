package com.vinaylearn.java8.lamdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /*
        * prior Java 8
        * */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is : "+comparator.compare(3,2));

        /*
        * lambda java 8
        *
        * */
        Comparator<Integer> comparatorLambda = (Integer a,  Integer b)->    a.compareTo(b); ;
        System.out.println("Result of lambda comparator is :  "+comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1 = (a,b)-> a.compareTo(b);
        System.out.println("Result of using lambda comparator is :  "+comparatorLambda1.compare(3,2));
        Comparator<Integer> comparatorLambda2 = Comparator.naturalOrder();
        System.out.println("Result of using lambda comparator is :  "+comparatorLambda2.compare(3,2));
    }
}
