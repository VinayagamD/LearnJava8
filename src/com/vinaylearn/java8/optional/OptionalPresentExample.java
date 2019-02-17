package com.vinaylearn.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        // isPresent
        Optional<String> optional = Optional.ofNullable("hello Optional");
//        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        // ifPresent
        optional.ifPresent(s -> System.out.println(s));
    }
}
