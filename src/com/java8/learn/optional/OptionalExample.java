package com.java8.learn.optional;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName() {
        Student student = StudentDataBase.getFirstStudentSupplier.get();
        if(student != null) return student.getName();
        return null;
    }
    public static Optional<String> getStudentNameOptional() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.getFirstStudentSupplier.get());
        if(student.isPresent()) {
            return student.map(Student::getName);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        String name = getStudentName();
        System.out.println("Student normal");
        if(name != null)
            System.out.println("Student name length: " + name.length());
        else
            System.out.println("Name not found");
        System.out.println("Student optional");
        Optional<String> sName = getStudentNameOptional();
        if(sName.isPresent())
            System.out.println("Student name length: " + sName.get().length());
        else
            System.out.println("Name not found");
    }
}
