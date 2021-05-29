package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);

        //Filter for students grade > 3

        Map<String, List<String>> studentMapGraded = StudentDataBase.getAllStudents()
                .parallelStream()
                .filter(student -> student.getGradeLevel() >= 3)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMapGraded);
    }
}
