package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMap {
    public static List<String> printAllStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()  //Gives a unique list with non-repeating values
                .collect(Collectors.toList());
    }

    public static List<String> sortAllStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()//Gives a unique list with non-repeating values
                .sorted()
                .collect(Collectors.toList());
    }

    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }


    public static void main(String[] args) {
        System.out.println(printAllStudentActivities());
        System.out.println(getStudentActivitiesCount());
        System.out.println(sortAllStudentActivities());
    }
}
