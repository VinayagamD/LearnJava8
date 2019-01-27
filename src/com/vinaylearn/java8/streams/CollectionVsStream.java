package com.vinaylearn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for (String name: names) {
            System.out.println(name);
        }
        for (String name: names) {
            System.out.println(name);
        }


        
        names.remove(0);

        System.out.println(names);

//        names.stream().add not found
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        nameStream.forEach(System.out::println);

    }
}
