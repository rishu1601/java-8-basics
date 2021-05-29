package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    public static void nameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> stringListBiConsumer = (name, activities) -> System.out.println(name +  " : " + activities);
        studentList.forEach(student -> stringListBiConsumer.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer =  (a, b) -> {
            System.out.println("a : " + a);
            System.out.println("b : " + b);
        };
        biConsumer.accept("Hi", "Rishabh");

        //Consumer doesn't return any value.
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println(a + "*" + b + "=" + a*b);
        multiply.accept(10, 20);
        nameAndActivities();
    }
}
