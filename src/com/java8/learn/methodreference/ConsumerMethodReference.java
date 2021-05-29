package com.java8.learn.methodreference;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> c1 = System.out::println;

    public static void main(String[] args) {
        System.out.println(ConsumerMethodReference.class);
        StudentDataBase.getAllStudents().forEach(c1);
    }
}
