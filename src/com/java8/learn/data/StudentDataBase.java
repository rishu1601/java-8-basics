package com.java8.learn.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {
    /**
     * @return first student of the database.
     */
    public static Supplier<Student> getFirstStudentSupplier = () -> {
        Bike bike = new Bike();
        bike.setName("someBikeName");
        bike.setModel("someBikeModel");
        Student student = getAllStudents().get(0);
        student.setBike(Optional.ofNullable(bike));
        return student;
    };

    /**
     * Total of 6 students in the database.
     * @return all students
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, Gender.MALE, 13,  Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8, Gender.FEMALE, 10, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,Gender.FEMALE, 17, Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,Gender.MALE, 19, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,Gender.FEMALE, 21, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,Gender.MALE, 16, Arrays.asList("swimming", "basketball","baseball","football"));

        return Arrays.asList(student1,student2,student3,student4,student5,student6);
    }
}
