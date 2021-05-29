package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMap {
    public static Set<String> nameList() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
