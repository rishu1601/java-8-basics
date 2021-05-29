package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample2 {
    static Function<List<Student>, Map<String, Double>> studentGradeFunction = (students) -> {
        Map<String, Double> gpaMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateInterfaceExample2.studentGradePredicate.test(student))
                gpaMap.put(student.getName(), student.getGpa());
        });
        return gpaMap;
    };
    public static void main(String[] args) {
        System.out.println(FunctionExample2.class);
        System.out.println(studentGradeFunction.apply(StudentDataBase.getAllStudents()));
    }
}
