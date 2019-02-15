package com.vinaylearn.java8.streams_terminal;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void groupStudentsByGender(){
       Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING":"AVERAGE"));
        System.out.println(studentMap);
    }
    public static void twoLevelGrouping_1(){
    Map<Integer,Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
     Map<Integer,Integer> studentMap   = StudentDataBase.getAllStudents().
                stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){
      LinkedHashMap<String, Set<Student>>  studentLinkedHashMap =   StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,Collectors.toSet()));
        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa(){
     Map<Integer,Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(studentMapOptional1);
    }
    public static void calculateLeastGpa(){
     Map<Integer,Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(studentMapOptional1);
    }



    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupingBy();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGroupBy();
        calculateTopGpa();
        calculateLeastGpa();
    }
}
