package com.vinaylearn.java8.funcationalinterface;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel : ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa : ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudent(){
        System.out.println("filterStudent : ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudent();
    }
}
