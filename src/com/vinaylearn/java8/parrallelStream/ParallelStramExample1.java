package com.vinaylearn.java8.parrallelStream;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStramExample1 {
    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivites)  // Stream<List<String>> - stateless
                .flatMap(List::stream) //Stream<String> - stateless
                .distinct() // stateful
                .sorted() // stateful
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration top execute sequential stream = "+(endTime-startTime));
        return studentActivities;

    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream().parallel() // Stream<Student>
                .map(Student::getActivites)  // Stream<List<String>> - stateless
                .flatMap(List::stream) //Stream<String> - stateless
                .distinct() // stateful
                .sorted() // stateful
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration top execute parallel stream = "+(endTime-startTime));
        return studentActivities;

    }


    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
