package com.vinaylearn.java8.lamdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;
//        Not able to use in consumer lambda which is already defined
        Consumer<Integer> c1 = (i1)->{
//            Not possible to  create new variable which is local
//            int i = 2;
            System.out.println("Value of i is :" +i1);
        };
    }
}
