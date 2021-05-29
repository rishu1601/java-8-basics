package com.java8.learn.stream.terminal;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMapping {

    public static void main(String[] args) {
        List<String> studentList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println("res: " + studentList);
    }
}
