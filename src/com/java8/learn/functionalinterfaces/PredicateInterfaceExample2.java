package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample2 {
    static Predicate<Student> studentGradePredicate = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> studentGpaPredicate = (s) -> s.getGpa() >= 3.9;
    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(studentGradePredicate.test(student)) {
                System.out.println(student.toString());
            }
        }));
    }
    public static void filterStudentByGpa() {
        System.out.println("Filtering students for GPA >= 3.9");
        StudentDataBase.getAllStudents()
                .forEach(student -> {
                    if(studentGpaPredicate.test(student)) {
                        System.out.println(student.toString());
                    }
                });
    }
    public static void filterStudentByGpaAndGradeLevel() {
        System.out.println("Filtering students for GPA >= 3.9 and Grade >= 3");
        StudentDataBase.getAllStudents()
                .forEach(student -> {
                    if(studentGpaPredicate.and(studentGradePredicate).test(student)) {
                        System.out.println(student.toString());
                    }
                });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentByGpaAndGradeLevel();
    }
}
