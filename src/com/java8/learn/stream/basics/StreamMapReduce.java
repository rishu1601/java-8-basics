package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

public class StreamMapReduce {
    private static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 4.0)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }
}
