package com.vinaylearn.java8.streams;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter((student -> student.getGender().equals("female")))  // Stream<Student>
                // filters and sends only the students whose gender is female
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        System.out.println("filterStudents : " +filterStudents());
          filterStudents().forEach(System.out::println);
    }
}
