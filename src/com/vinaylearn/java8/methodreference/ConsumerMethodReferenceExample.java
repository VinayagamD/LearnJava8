package com.vinaylearn.java8.methodreference;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * classname::methodName
     */
//    static Consumer<Student> c1 = p -> System.out.println(p);
    static Consumer<Student> c1 =System.out::println;

    /**
     * classname::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivites;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
