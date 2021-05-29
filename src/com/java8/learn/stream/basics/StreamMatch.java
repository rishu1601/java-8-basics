package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;

public class StreamMatch {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static boolean allStudentsGpa(double n) {
        return studentList.stream()
                .allMatch(student -> student.getGpa() >= n);
    }
    public static boolean anyStudentGpa(double n) {
        return studentList.stream()
                .anyMatch(student -> student.getGpa() >= n);
    }
    public static boolean noStudentGpa(double n) {
        return studentList.stream()
                .noneMatch(student -> student.getGpa() >= n);
    }

    public static void main(String[] args) {
        System.out.println("Result of all match : " + allStudentsGpa(4.0));
        System.out.println("Result of any match : " + anyStudentGpa(4.0));
        System.out.println("Result on none match : " + noStudentGpa(7.0));
    }
}
