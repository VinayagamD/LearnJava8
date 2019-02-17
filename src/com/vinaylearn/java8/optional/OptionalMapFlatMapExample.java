package com.vinaylearn.java8.optional;

import com.vinaylearn.java8.data.Bike;
import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter(){
        Optional<Student>  studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        studentOptional
                .filter(student -> student.getGpa()>=4.0)
                .ifPresent(student -> System.out.println(student));
    }
    // map
    public static void optionalMap(){
        Optional<Student>  studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        if(studentOptional.isPresent()){
            Optional<String>  stringOptional = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    // flatMap
    private static void optionalFlatMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        Optional<String>  name = studentOptional
                .filter(student -> student.getGpa() >= 3.5) // Optional<Student<Optional<Bike>>>
                .flatMap(Student::getBike)//returns -> Optional<Bike>
                .map(Bike::getName);
//        System.out.println(name);
        name.ifPresent(s -> System.out.println("name : "+s));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
