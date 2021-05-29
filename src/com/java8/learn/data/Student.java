package com.java8.learn.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private Gender gender;
    private int noteBooks;
    private Optional<Bike> bike = Optional.empty();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender=" + gender +
                ", noteBooks=" + noteBooks +
                ", bike=" + bike +
                ", activities=" + activities +
                '}';
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public Student(String name, int gradeLevel, double gpa, Gender gender, int noteBooks, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.noteBooks = noteBooks;
        this.activities = activities;
    }

    public Student(String name, int gradeLevel, double gpa, Gender gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student() {
        this.name = "default";
        this.gradeLevel = 10;
        this.gpa = 5.0;
        this.gender = Gender.MALE;
        this.activities = new ArrayList<>();
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    List<String> activities = new ArrayList<>();

    public  List<String> getActivities() {
        return this.activities;
    }
    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

}
