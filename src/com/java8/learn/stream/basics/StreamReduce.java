package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static int getMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream().reduce(
                (s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2
        );
    }
    public static void main(String[] args) {
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
//        System.out.println(getMultiplication(integerList));
        Optional<Student> highestGpaStudent = getHighestGpaStudent();
        highestGpaStudent.ifPresent(System.out::println);
    }
}
