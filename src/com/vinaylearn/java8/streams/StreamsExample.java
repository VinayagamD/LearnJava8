package com.vinaylearn.java8.streams;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    static Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentgpaPredicate = (student) -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        // student name nad their activities in the map

       Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
               .filter(studentPredicate)
               .filter(studentgpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivites));
        System.out.println(studentMap);
    }
}
