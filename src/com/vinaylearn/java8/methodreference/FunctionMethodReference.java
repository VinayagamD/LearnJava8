package com.vinaylearn.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String,String> toUpperCaseLambda =(s) -> s.toUpperCase();
    static Function<String,String> toUpperMethodRefence =String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java8"));
        System.out.println(toUpperMethodRefence.apply("java8"));

    }

}
