package com.vinaylearn.java8.funcationalinterface;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String,List<String>> biConsumer = (name,activies) -> System.out.println(name +" : " +activies);
        List<Student>  studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivites()));
    }

    public static void main(String[] args) {


        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a: " + a + ", b: " +b);
        };

        biConsumer.accept("java7","java8");

        BiConsumer<Integer,Integer> mutliply = (a,b)->{
            System.out.println("Multiplication "+(a*b));
        };
        BiConsumer<Integer,Integer> division = (a,b)->{
            System.out.println("Division "+(a/b));
        };
        mutliply.andThen(division).accept(10,5);
        BiConsumer<Integer,Integer> addition = (a,b)->{
            System.out.println("Addition "+(a+b));
        };
        BiConsumer<Integer,Integer> subtraction = (a,b)->{
            System.out.println("Subtraction "+(a-b));
        };

        addition.andThen(subtraction).accept(10,5);

        nameAndActivities();

    }
}
