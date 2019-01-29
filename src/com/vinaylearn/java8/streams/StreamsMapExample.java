package com.vinaylearn.java8.streams;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList(){
        List<String> studentList = StudentDataBase.getAllStudents().stream()
//                Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)// Stream<String> -> upper case operation on each input
                .collect(Collectors.toList()); // List<String>
        return studentList;
    }
     public static Set<String> nameSet(){
            Set<String> studentSet = StudentDataBase.getAllStudents().stream()
    //                Student as an input -> Student Name
                    .map(Student::getName) // Stream<String>
                    .map(String::toUpperCase)// Stream<String> -> upper case operation on each input
                    .collect(Collectors.toSet()) ; // Set<String>
            return studentSet;
        }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
