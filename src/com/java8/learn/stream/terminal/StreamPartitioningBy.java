package com.java8.learn.stream.terminal;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamPartitioningBy {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static Map<Boolean, List<Student>> partitioningBy1() {
        return studentList.stream()
                .collect(
                    Collectors.partitioningBy(student -> student.getGpa() >= 3.9)
                );
    }

    public static Map<Boolean, Set<Student>> partitioningBy2() {
        return studentList.stream()
                .collect(
                        Collectors.partitioningBy(
                                student -> student.getGpa() >= 3.9,
                                toSet()
                        )
                );
    }
    public static void main(String[] args) {
        System.out.println("Partitioning By 1: ");
        System.out.println(partitioningBy1());
        System.out.println("Partitioning By 2: ");
        System.out.println(partitioningBy2());
    }
}
