package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Optional;
import java.util.List;

public class StreamsFind {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static Optional<Student> findFirstStudentWithGpaGreaterThan(double n) {
        return studentList.stream()
                .filter(student -> student.getGpa() >= n)
                .findFirst();
    }
    public static Optional<Student> findAnyStudentWithGpaGreaterThan(double n) {
        return studentList.stream()
                .filter(student -> student.getGpa() >= n)
                .findAny();
    }
    public static void main(String[] args) {
        System.out.println("Find first: ");
        findFirstStudentWithGpaGreaterThan(3.9).ifPresent(System.out::println);
        System.out.println("Find any: ");
        findAnyStudentWithGpaGreaterThan(3.9).ifPresent(System.out::println);
    }
}
