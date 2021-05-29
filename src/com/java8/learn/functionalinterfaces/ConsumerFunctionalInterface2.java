package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface2 {
    static Consumer<Student> studentNameConsumer = student -> System.out.println(student.getName());
    static Consumer<Student> studentActivitiesConsumer = student -> System.out.println(student.getActivities());

    public static void  printStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> System.out.println(student));
    }

    public static void printNameAndActivities() {
        System.out.println("Printing the name and activities");
        List<Student> studentList = StudentDataBase.getAllStudents();
        //Consumer chaining
        studentList.forEach(studentNameConsumer.andThen(studentActivitiesConsumer));
    }

    public static void printNameAndActivitiesWithFilter() {
        System.out.println("Printing the name and activities with filtering");
        List<Student> studentList = StudentDataBase.getAllStudents();
        //With Filter
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3) {
                 studentNameConsumer.andThen(studentActivitiesConsumer).accept(student);
            }
        });
    }



    public static void main(String[] args) {
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesWithFilter();
    }
}
