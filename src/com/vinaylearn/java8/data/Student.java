package com.vinaylearn.java8.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;

    public Student(String name, int gradeLevel, double gpa, String gender,List<String> activites) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activites = activites;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printListOfActivites(){
        System.out.println(activites);
    }

    List<String> activites = new ArrayList<>();

    public List<String> getActivites() {
        return activites;
    }

    public void setActivites(List<String> activites) {
        this.activites = activites;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activites=" + activites +
                '}';
    }
}
