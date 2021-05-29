package com.java8.learn.stream.basics;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

public class StreamLimitSkip {
    private static Optional<Integer> sumOfTopNotebooks(int n) {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getNoteBooks).reversed())
                .map(Student::getNoteBooks)
                .limit(n)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        if(sumOfTopNotebooks(4).isPresent()){
            System.out.println("Top n notebooks sum: " + sumOfTopNotebooks(4).get());
        } else {
            System.out.println("Something went wrong");
        }
    }
}
