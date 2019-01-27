package com.vinaylearn.java8.imperativevsdecalrative;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Function<String,String> addSomeString = (name) -> name.toUpperCase().concat(" default");
        System.out.println(addSomeString.apply("Hello"));
    }
}
