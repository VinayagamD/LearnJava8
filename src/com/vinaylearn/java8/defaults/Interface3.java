package com.vinaylearn.java8.defaults;

public interface Interface3 extends Interface2{

    default void methodC(){
        System.out.println("Inside Method C");
    }
}
