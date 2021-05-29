package com.java8.learn.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);
        LocalDate ld1 = LocalDate.of(2021, 12, 16);
        System.out.println("LocalDate1: " + ld1);
        LocalDate ld2 = LocalDate.ofYearDay(2022, 165);
        System.out.println("LocalDate2: " + ld2);

        /**
         * Get values from local date
         */
        System.out.println("getDayOfMonth: " + localDate.getDayOfMonth());
        System.out.println("getYear: " + localDate.getYear());
        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());

        /**
         * Modify localDate
         */
        LocalDate ld3 = ld1.plusDays(1);
//        ld3.isLeapYear();
//        LocalDate ld3 = ld1.plusYears(1);
//        LocalDate ld3 = ld1.plusMonths(1);
//        LocalDate ld4 = ld1.plusWeeks(1);
//        LocalDate ld3 = ld1.minusMonths(1);
//        LocalDate ld3 = ld1.minusYears(1);
//        LocalDate ld3 = ld1.minusDays(1);
//        LocalDate ld3 = ld1.minusWeeks(1);

    }
}
