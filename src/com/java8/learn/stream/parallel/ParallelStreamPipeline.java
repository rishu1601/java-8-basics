package com.java8.learn.stream.parallel;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamPipeline {
    public static void printAllStudentActivitiesSeq() {
        long startT = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()  //Gives a unique list with non-repeating values
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Time taken : " + (System.currentTimeMillis() - startT));
    }

    public static void printAllStudentActivitiesParallel() {
        long startT = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()  //Gives a unique list with non-repeating values
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Time taken : " + (System.currentTimeMillis() - startT));
    }

    public static void main(String[] args) {
        System.out.println("Parallel");
        printAllStudentActivitiesParallel();

        System.out.println("Sequential");
        printAllStudentActivitiesSeq();
    }
}
