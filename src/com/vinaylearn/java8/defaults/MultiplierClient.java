package com.vinaylearn.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplieImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println("Result is : "+multiplier.multiply(integerList));
        System.out.println("Default method size is : "+multiplier.size(integerList));
        System.out.println("static method isEmpty is : "+Multiplier.isEmpty(integerList));
    }
}
