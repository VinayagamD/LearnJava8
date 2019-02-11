package com.vinaylearn.java8.streams_terminal;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("names ==> " +names);
        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
        System.out.println("namesSet ==> " + namesSet);
        List<String> namesList= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("namesList ==> "+namesList);
    }
}
