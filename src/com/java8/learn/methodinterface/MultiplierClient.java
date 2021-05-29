package com.java8.learn.methodinterface;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .collect(Collectors.toList());
        System.out.println("Result: " + multiplier.multiply(integerList));
        System.out.println("size: " + multiplier.size(integerList));
        System.out.println("empty: " + Multiplier.isEmpty(integerList));
    }
}
