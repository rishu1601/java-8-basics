package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    Predicate<Student> gradeP = student -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaP = student -> student.getGpa() >= 3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ": " + activities);
    Consumer<Student> studentConsumer = (student -> {
        if(gpaP.and(gradeP).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });
    public void nameAndActivities() {
        StudentDataBase.getAllStudents().forEach(student -> studentConsumer.accept(student));
    }
    public static void main(String[] args) {
        PredicateAndConsumer predicateAndConsumer = new PredicateAndConsumer();
        predicateAndConsumer.nameAndActivities();
    }
}
