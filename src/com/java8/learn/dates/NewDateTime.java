package com.java8.learn.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTime {
    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);
        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);
        //LocalDateAndTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);
    }
}
