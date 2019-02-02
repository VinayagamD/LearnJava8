package com.vinaylearn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxvalue(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce(0, (x,y)-> x>y ? x: y);
    }

    public static int findMinvalue(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                // x variable holds the min value for each element in the iteration
                .reduce(0, (x,y)-> x<y ? x: y);
    }

    public static Optional<Integer> findMaxvalueOptional(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce( (x,y)-> x>y ? x: y);
    }

    public static Optional<Integer> findMinvalueOptional(List<Integer> integerList){
            return integerList.stream()
                    //6 -> y
                    //7 -> y
                    //8 -> y
                    //9 -> y
                    //10 -> y
                    // x variable holds the max value for each element in the iteration
                    .reduce( (x,y)-> x<y ? x: y);
        }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        List<Integer> integerList = new ArrayList<>();
        int maxValue = findMaxvalue(integerList);
        System.out.println(" max value is : "+maxValue);
        Optional<Integer> maxValueOptional = findMaxvalueOptional(integerList);
        System.out.println("Optional Max is "+maxValueOptional);
        if(maxValueOptional.isPresent()){
            System.out.println("Maxvalue using optional : " +maxValueOptional.get());
        }else {
            System.out.println("Input list is empty");
        }

        int minValue = findMaxvalue(integerList);
        System.out.println(" min value is : "+minValue);
        Optional<Integer> minValueOptional = findMinvalueOptional(integerList);
        System.out.println("Optional Max is "+minValueOptional);
        if(minValueOptional.isPresent()){
            System.out.println("Minvalue using optional : " +minValueOptional.get());
        }else {
            System.out.println("Input list is empty");
        }

    }
}
