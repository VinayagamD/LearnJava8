package com.vinaylearn.java8.lamdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {
//        int value = 4; // local variable
        Consumer<Integer> c1 = (i)->{
//            value cannot be resigned since it its final variable to lambda
//            value++;
            value ++;
            System.out.println(value+i);
        };
//        value = 6;
        c1.accept(4);

    }
}
