package com.vinaylearn.java8.streams;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter((student -> student.getGradeLevel() >= 3))
                .filter((student -> student.getGender().equals("female")))
                .map(Student::getNoteBooks) // Stream<Integer>
//                .reduce(0, (a, b) -> a+b);
//                .reduce( (a, b) -> a+b);
        .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
//        Optional<Integer> noOfNoteBooks = noOfNoteBooks();
//        if(noOfNoteBooks.isPresent())
        System.out.println("No of Notebooks : "+noOfNoteBooks());
    }
}
