package com.java8.learn.stream.terminal;

import com.java8.learn.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCounting {
    public static long counting() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("Counting: " + counting());
    }
}
