package com.vinaylearn.java8.lamdas;

public class RunnableLamdaExample {

    public static void main(String[] args) {
        /*
        *
        * Prior Java8
        * */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

//        java 8 lambda

//         () -> {};
        Runnable runnableLambda =  ()->{
            System.out.println("Inside Runnable 2");
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda1 =  ()-> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("Inside Runnable 4")).start();

    }

}
