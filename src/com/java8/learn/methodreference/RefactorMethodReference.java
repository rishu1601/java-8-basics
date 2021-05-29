package com.java8.learn.methodreference;


import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {
    //Refactor to use method reference
    static Predicate<Student> predicate = RefactorMethodReference::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 2;
    }

    public static void main(String[] args) {
        System.out.println(RefactorMethodReference.class);
        System.out.println(predicate.test(StudentDataBase.getFirstStudentSupplier.get()));
    }
}
