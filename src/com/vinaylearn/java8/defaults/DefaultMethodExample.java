package com.vinaylearn.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {

    public static void main(String[] args) {
        /**
         * Sort the list names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adam","Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior Java 8
         */
//        Collections.sort(stringList);
//        System.out.println("Sorted List using Collections.sort() : "+stringList);

        /**
         * Java 8
         */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using  List.sort() Comparator.naturalOrder() : "+stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List using  List.sort() Comparator.reverseOrder() : "+stringList);

    }
}
