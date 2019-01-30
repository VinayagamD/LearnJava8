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
//               .distinct()
        .collect(Collectors.toList());
       return studentActivities;

    }

    public static List<String> printUniqueStudentActivities(){
       List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivites)  // Stream<List<String>>
               .flatMap(List::stream)
               .distinct()
        .collect(Collectors.toList());
       return studentActivities;

    }

    public static long printUniqueStudentActivitiesCount(){
       long studentActivitiesCount = StudentDataBase.getAllStudents().stream() // Stream<Student>
        .map(Student::getActivites)  // Stream<List<String>>
               .flatMap(List::stream) // Convert Stream to Java Object
               .distinct() // Stream<String> -> with distinct function performed
                .count();
       return studentActivitiesCount;

    }

    public static List<String> printUniqueSortedStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivites)  // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;

    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : "+printStudentActivities());
        System.out.println("printUniqueStudentActivities : "+printUniqueStudentActivities());
        System.out.println("printUniqueStudentActivitiesCount : "+printUniqueStudentActivitiesCount());
        System.out.println("printUniqueSortedStudentActivities: "+printUniqueSortedStudentActivities());
    }
}
