package com.vinaylearn.java8.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        // Jan 1st 1970 -> Epoch -> 86400 seconds
        System.out.println("getEpochSecond : "+instant.getEpochSecond());
        System.out.println("ofEpochSecond : "+Instant.ofEpochSecond(0));
        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant,instant1);
        System.out.println("getNano difference : "+duration.getNano());
    }
}
