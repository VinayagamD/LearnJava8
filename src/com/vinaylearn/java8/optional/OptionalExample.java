package com.vinaylearn.java8.optional;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
     Student student = StudentDataBase.studentSupplier.get();
     if(student!= null)
         return student.getName();
     return null;
    }

    public static Optional<String> getStudnetNameOptional(){
//       Optional<Student> studentOptional  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
       Optional<Student> studentOptional  = Optional.ofNullable(null);
        if(studentOptional.isPresent())
            return studentOptional.map(Student::getName);
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if(name!= null)
        System.out.println("Length of the student name : "+name.length());
        else
            System.out.println("Name not found");

        Optional<String> stringOptional = getStudnetNameOptional();
        if(stringOptional.isPresent())
            System.out.println(
                    "Length of the Student name : "+
                    stringOptional.get().length());
        else
            System.out.println("Name not found");

    }
}
