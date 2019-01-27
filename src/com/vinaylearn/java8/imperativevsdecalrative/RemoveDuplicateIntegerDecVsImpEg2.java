package com.vinaylearn.java8.imperativevsdecalrative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateIntegerDecVsImpEg2 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,3,3,4,5,5,5,5,6,7,8,8,8,9,10);

        /*
        * Imperative
        * */

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer i:integers) {
            if(!uniqueList.contains(i))
                uniqueList.add(i);
        }

        System.out.println("Imperative Style" +uniqueList);
        /*
        *
        * Declarative
        * */

        List<Integer> uniqueList1 = integers.stream().distinct().collect(Collectors.toList());

        System.out.println(" Declarative Style: " + uniqueList1);

    }
}
