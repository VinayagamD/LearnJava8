package com.vinaylearn.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : "+localDate);
        LocalDate  localDate1 = LocalDate.of(2018,07,17);
        System.out.println("LocalDate 1 : "+localDate1);
        LocalDate localDate2 = LocalDate.ofYearDay(2018,02);
        System.out.println("LocalDate 2 : "+localDate2);

        /**
         * Get values from localDate
         */
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getMonthValue : "+localDate.getMonthValue());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear : "+localDate.getDayOfYear());
        System.out.println("Day of Month using get : "+localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying Local Date
         */
        System.out.println("plusDays : "+localDate.plusDays(2));
        System.out.println("plusMonths : "+ localDate.plusMonths(2));
        System.out.println("minusDays : "+localDate.minusDays(2));
        System.out.println("withYear : "+localDate.withYear(2020));
        System.out.println("with ChronoField : "+localDate.with(ChronoField.YEAR,2021));
        System.out.println("with TemporalAdjusters : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("minus ChronoUnit : "+localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Additional Support Methods
         */
        System.out.println("leapyear : "+LocalDate.ofYearDay(2020,1).isLeapYear());

        // localDate = 23-February-2019
        // localDate1 = 17-July-2018
        System.out.println("isEqual : "+localDate.isEqual(localDate1));
        System.out.println("isBefore : "+localDate1.isBefore(localDate));
        System.out.println("isAfter : "+localDate.isAfter(localDate1));

        /**
         * Unsupported
         */
//        System.out.println("ChronoUnits minus : "+localDate.minus(1,ChronoUnit.MINUTES));
        System.out.println("isSupported : "+localDate.isSupported(ChronoUnit.MINUTES));
    }
}
