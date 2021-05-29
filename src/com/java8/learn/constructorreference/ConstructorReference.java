package com.java8.learn.constructorreference;

import com.java8.learn.data.Student;

import java.util.function.Supplier;

public class ConstructorReference {
    static Supplier<Student> studentSupplier = Student::new;
    public static void main(String[] args) {
        System.out.println(ConstructorReference.class);
        System.out.println(studentSupplier.get());
    }
}
