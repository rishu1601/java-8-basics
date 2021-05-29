package com.java8.learn.stream.terminal;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.stream.Collectors;

public class TerminalJoining {
    public static String joining1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("##"));
    }

    public static String joining3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("##", "(", ")"));
    }
    public static void main(String[] args) {
        System.out.println("Joining 1 " + joining1());
        System.out.println("Joining 2 " + joining2());
        System.out.println("Joining 3 " + joining3());
    }
}
