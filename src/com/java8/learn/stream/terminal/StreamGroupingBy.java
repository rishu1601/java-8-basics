package com.java8.learn.stream.terminal;

import com.java8.learn.data.Gender;
import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

public class StreamGroupingBy {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static Map<Gender, List<Student>> groupStudentsByGender() {
        return studentList
                .stream()
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customGroupBy() {
        return studentList
                .stream()
                .collect(groupingBy(s -> s.getGpa() >= 3.9 ? "Outstanding" : "Average"));
    }

    public static Map< Integer, Map<String, List<Student>>> groupBy2PropsEx1() {
        return studentList.stream().collect(
                groupingBy(
                        Student::getGradeLevel,
                        groupingBy(s -> s.getGpa() >= 3.9 ? "Outstanding" : "Average")
                )
        );
    }

    public static Map< Integer, Integer> groupBy2PropsEx2() {
        return studentList.stream().collect(
                groupingBy(
                        Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)
                )
        );
    }

    public static LinkedHashMap<String, Set<Student>> groupBy3PropsEx1() {
        return studentList
                .stream()
                .collect(
                        groupingBy(Student::getName, LinkedHashMap::new, toSet())
                );

    }

    public static Map<Integer, Optional<Student>> calculateTopGpaOptional() {
        return studentList.stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
    }

    public static Map<Integer, Student> calculateTopGpa() {
        return studentList.stream()
                .collect(
                    groupingBy(
                        Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
                    )
                );
    }

    public static void main(String[] args) {
        System.out.println("Grouped by Gender");
        System.out.println(groupStudentsByGender());
        System.out.println("Grouped custom");
        System.out.println(customGroupBy());
        System.out.println("Multiple group by ex 1");
        System.out.println(groupBy2PropsEx1());
        System.out.println("Multiple group by ex 2");
        System.out.println(groupBy2PropsEx2());

        System.out.println("3 params by ex 1");
        System.out.println(groupBy3PropsEx1());

        System.out.println("Max grade in each section");
        System.out.println(calculateTopGpa());
    }
}
