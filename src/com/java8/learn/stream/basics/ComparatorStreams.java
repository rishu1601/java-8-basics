package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorStreams {
    static List<Student> allStudents = StudentDataBase.getAllStudents();

    public static List<Student> sortStudentsByName() {
        return allStudents
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsGpa() {
        return allStudents
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsGpaDesc() {
        return allStudents
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Students sorted by names: ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by gpa: ");
        sortStudentsGpa().forEach(System.out::println);
        System.out.println("Students sorted by gpa desc: ");
        sortStudentsGpaDesc().forEach(System.out::println);
    }
}
