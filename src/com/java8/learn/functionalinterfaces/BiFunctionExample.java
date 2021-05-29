package com.java8.learn.functionalinterfaces;

import com.java8.learn.data.Student;
import com.java8.learn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentPredicateMapBiFunction =
            ((students, studentPredicate) -> {
              Map<String, Double> result = new HashMap<>();
              students.forEach(student -> {
                  if(studentPredicate.test(student))
                      result.put(student.getName(), student.getGpa());
              });
              return result;
            });

    public static void main(String[] args) {
        System.out.println(BiFunctionExample.class);
        System.out.println(studentPredicateMapBiFunction.apply(StudentDataBase.getAllStudents(), PredicateInterfaceExample2.studentGpaPredicate));

    }
}
