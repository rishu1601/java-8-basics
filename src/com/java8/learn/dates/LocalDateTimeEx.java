package com.java8.learn.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
        LocalDate localDate = LocalDate.of(2021, 1, 16);
        System.out.println("localDate To localDateTime: " + localDate.atTime(10, 20, 12, 14214));
        LocalDate localDate1 = LocalDate.of(2021,5,29);
        LocalDate localDate2 = LocalDate.of(1998, 1, 16);
        /**
         * Comparing Dates
         */
        Period period = localDate2.until(localDate1);
        System.out.println("Period : " + period);
        System.out.println("PeriodDays : " + period.getDays());
        System.out.println("PeriodTotalMonths : " + period.toTotalMonths());

        /**
         * Comparing times and localDateTimes
         */
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, LocalTime.now());
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, LocalTime.now().plus(2, ChronoUnit.HOURS));
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println("Duration: " + duration);
        System.out.println("Duration getSeconds(): " + duration.getSeconds());
        System.out.println("Duration getNano(): " + duration.getNano());

    }
}
