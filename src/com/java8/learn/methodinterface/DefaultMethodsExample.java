package com.java8.learn.methodinterface;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        /**
         * Sort a list in alphabetical order.
         */
        List<String> stringList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        /**
         * Prior to java 8
         */
        Collections.sort(stringList);
        System.out.println("Sorted list using collectors: " + stringList);

        /**
         * Java 8 onwards
         */
        List<String> stringList2 = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        stringList2.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using list sort: " + stringList2);
    }
}
