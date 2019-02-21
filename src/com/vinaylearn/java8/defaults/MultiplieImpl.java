package com.vinaylearn.java8.defaults;

import java.util.List;

public class MultiplieImpl implements  Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y)->x*y);

    }

    @Override
    public int size(List<Integer> integerList) {
        System.out.println("Inside MultiplierImpl class");
        return integerList.size();
    }
}
