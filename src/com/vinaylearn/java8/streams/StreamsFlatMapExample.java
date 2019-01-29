package com.vinaylearn.java8.streams;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){
       List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivites)  // Stream<List<String>>
               .flatMap(List::stream)
               .distinct()
        .collect(Collectors.toList());
       return studentActivities;

    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : "+printStudentActivities());
    }
}
