package com.java8.learn.optional;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMap {
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getFirstStudentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.5).ifPresent(System.out::println);
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getFirstStudentSupplier.get());
        if(studentOptional.isPresent()) {
            studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName)
                    .ifPresent(System.out::println);
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getFirstStudentSupplier.get());
        Optional<String> bikeName = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(bike -> bike.getName());
        System.out.println("Bike Name: ");
        bikeName.ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
