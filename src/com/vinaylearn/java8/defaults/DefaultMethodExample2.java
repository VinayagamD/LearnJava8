package com.vinaylearn.java8.defaults;

import com.vinaylearn.java8.data.Student;
import com.vinaylearn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

      static   Consumer<Student> studentConsumer = (student -> System.out.println(student));
      static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
      static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
      public static  void sortByName(List<Student> studentList){
          System.out.println("After SortByName");
          Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
          studentList.sort(nameComparator);
          studentList.forEach(studentConsumer);

      }

      static  void sortByGPA(List<Student> studentList){
          System.out.println("After SortByGPA");
          Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
          studentList.sort(nameComparator);
          studentList.forEach(studentConsumer);

      }

      static void comparatorChaining(List<Student> studentList){
          System.out.println("After comparatorChaining");
          studentList.sort(gradeComparator.thenComparing(nameComparator));
          studentList.forEach(studentConsumer);

      }

      static void sortWithNullValues(List<Student> studentList){
          System.out.println("After SortWithNullValues : ");
//        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
      }
    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();

//        System.out.println(students);
        System.out.println("Before Sort");
        students.forEach(studentConsumer);
//        sortByName(students);
//        sortByGPA(students);
//        comparatorChaining(students);
        sortWithNullValues(students);
    }
}
