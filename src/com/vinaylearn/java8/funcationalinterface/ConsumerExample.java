package com.vinaylearn.java8.funcationalinterface;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
      static   Consumer<Student> c2 = (student) -> System.out.println(student);
       static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
       static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
       static Consumer<Student> c4 = (student) -> System.out.println(student.getActivites());

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        System.out.println(" printNameAndActivities: ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); //consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println(" printNameAndActivitiesUsingCondition : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()  >= 3 &&  student.getGpa() >=3.9){
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        c1.accept("java8");
//        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
